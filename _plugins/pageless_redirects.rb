# Pageless Redirect Generator
#
# Generates redirect pages based on YAML or htaccess style redirects
#
# To generate redirects create _redirects.yml in the Jekyll root directory
# both follow the pattern alias, final destination.
#
# Example _redirects.yml
#
#   initial-page   : /destination-page
#   other-page     : http://example.org/destination-page
#   "another/page" : /destination-page
#
#  Result:
#   Requests to /initial-page are redirected to /destination-page
#   Requests to /other-page are redirected to http://example.org/destination-page
#   Requests to /another/page are redirected to /destination-page
#
# Author: Nick Quinlan
# Site: http://nicholasquinlan.com
# Plugin Source: https://github.com/nquinlan/jekyll-pageless-redirects
# Plugin License: MIT
# Plugin Credit: This plugin borrows heavily from alias_generator (http://github.com/tsmango/jekyll_alias_generator) by Thomas Mango (http://thomasmango.com)

module Jekyll

  class PagelessRedirectGenerator < Generator

    def generate(site)
      @site = site

      process_yaml
    end

    def process_yaml
      file_path = @site.source + "/_redirects.yml"
      if File.exists?(file_path)
        YAML.load_file(file_path, :safe => true).each do | new_url, old_url |
          generate_aliases( old_url, new_url )
        end
      end
    end

    def generate_aliases(destination_path, aliases)
      alias_paths ||= Array.new
      alias_paths << aliases
      alias_paths.compact!

      alias_paths.flatten.each do |alias_path|
        alias_path = alias_path.to_s

        alias_dir  = File.extname(alias_path).empty? ? alias_path : File.dirname(alias_path)
        alias_file = File.extname(alias_path).empty? ? "index.html" : File.basename(alias_path)

        fs_path_to_dir   = File.join(@site.dest, alias_dir)
        alias_index_path = File.join(alias_dir, alias_file)

        FileUtils.mkdir_p(fs_path_to_dir)

        File.open(File.join(fs_path_to_dir, alias_file), 'w') do |file|
          file.write(alias_template(destination_path))
        end

        (alias_index_path.split('/').size + 1).times do |sections|
          @site.static_files << Jekyll::PagelessRedirectFile.new(@site, @site.dest, alias_index_path.split('/')[0, sections].join('/'), '')
        end
      end
    end

    def alias_template(destination_path)
      <<-EOF
      <!DOCTYPE html>
      <html>
      <head>
      <title>Redirecting...</title>
      <link rel="canonical" href="#{destination_path}"/>
      <meta http-equiv="content-type" content="text/html; charset=utf-8" />
      <meta http-equiv="refresh" content="0; url=#{destination_path}" />
      </head>
      </html>
      EOF
    end
  end

  class PagelessRedirectFile < StaticFile
    require 'set'

    def destination(dest)
      File.join(dest, @dir)
    end

    def modified?
      return false
    end

    def write(dest)
      return true
    end
  end
end
