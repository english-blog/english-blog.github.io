---
layout: post
title: Blog like a Programmer
date: 2013-10-30
category: technology
---

[If you are not a programmer, this article may not interest you. Please skip and do something useful]  

### What is a blog?

A personal website through which a person expresses his opinions/ideas with the world regularly.  

### What constitutes a simple, basic blog?

Below are the basic components of any blogging system.  

1. Set of blog posts arranged in chronological order 
2. Set of pages  
3. Ability for the readers to comment on the blog post/pages  

I am not bothered about the awesome SEO plugins / other helpful plugins that help in many aspects of blogging. I am concerned only about the basic blog. All I need is a simple web page to express my ideas.  

### Do I need a CMS / Server side engine?  

Except for the comments section, the rest of the blog is static. I am not bothered about the comments anyway. It takes too much of your time away from blogging. If you really need them, there are client-side commenting systems available (like Disqus, Facebook comments, etc). So, I don't need a server-side code that connects to a database, executes the plugins, and creates the web page on the fly for every request to a web page (even with caching), when all I need is a set of a simple HTML file.  

There is an argument that says, *Infrastructure is cheap nowadays. The computing and storage abilities skyrocketed. We can use as much as we want*. Yes. It is. But, just because I have too much fuel, I would not travel 10 miles extra to the office every day. I always prefer the shortest possible route. How about you?. And again, that's a personal choice. I am not saying that what is being done is wrong, all I say is that I don't need all of those.  

### What I did not like in regular blogging systems?  

These are the two components of any regular blogging system which I do not prefer to use. However, thousands of fellow bloggers would die to use these. :)  

1. CMS / Server Side engine  
2. WYSIWYG editors  

When it comes to WYSIWYG editors, I simply hate the unnecessary markups created by the default editors or even the specialized installable editors in the market. For example, to display an image to the left side of the HTML, this is the code created by a blogger website.  

{% highlight html wrap  %}

<div class="separator" style="clear: both; text-align: center;">
<a href="http://1.bp.blogspot.com/-TIbnnU81F6I/UkhN_lONq6I/AAAAAAAAV-c/fL-BdakCXW8/s1600/100-Ways-to
-Motivate-Yourself-Chandler-Steve.jpg" imageanchor="1" style="clear: left; float: left; 
margin-bottom: 1em; margin-right: 1em;"><img border="0" height="318" src="http://1.bp.blogspot.com/
-TIbnnU81F6I/UkhN_lONq6I/AAAAAAAAV-c/fL-BdakCXW8/s320/100-Ways-to-Motivate-Yourself-Chandler-Steve.jpg" width="320" /></a></div>

{% endhighlight %}  
  
Where all I need is  
  
{% highlight html wrap  %}

<img style="float: left;" src="{{site.img-path}}/image.jpg"/>

{% endhighlight %}  
  

Do you see the point?. Most don't mind these additional markups. I do mind when I edit the blog posts.  

### Alternatives - Static Site Generators 

Static Site Generator is a program that generates a complete HTML website as output. The input would be a few configuration files, layout files, and markdown or simple HTML files. You can simply upload these HTML files to any web server and your blog is live. Whoah...  

I could find hundreds of SSGs written in various languages (ruby, python, node.js, javascript, java, etc) in the open source area. Since I do not know most of the programming languages but decided to learn any one of them - I chose the most widely used SSG. Jekyll, which powers GitHub. Seeing hundreds of plugins/websites out there for Jekyll already, I was confident that I would not be stuck with any problem for a long time.  

### Markdown

Markdown is a program or a plugin that transforms the plain text to a valid HTML / XHTML. As with any open source, there are many alternatives. I choose to use "red carpet" since this is the default Markdown processor that comes with Jekyll. The HTML produced by Markdown is the bare minimum HTML needed to render the page effectively in any browser. You have the option of using HTML directly in the Markdown text files if you feel that is needed.  

### Advantages of Static Site Generators

Some of the key advantages of using SSG are  

1. Security - No one can / will hack HTML. Hehe. There is nothing to hide and no need to fear someone hacking your website.  
2. Performance - No server-side code. No CMS. Lighting fast.  
3. Portability - Simply copy and paste the HTML to another host.  
4. Local Copy - You always have a local copy of the website on your computer all the time. No need to worry about the server crash.  
5. Version-Controlled Source - You have the option to version control your entire website with any version control systems like subversion, git, etc. I choose to keep the source on GitHub. This means that you never lose any single line of change made on your blog.  
6. Free hosting with custom domain - If all you need is a simple effective blog, you can host it for free with GitHub. The best part is that you can use your own domain with GitHub pages.  

And many more ...  

### Disadvantages of Static Site Generators

Some of the disadvantages of SSG are  

1. Any operation that was performed on the server is not possible. But there are alternatives like client-side comments, Google Custom Search to search the website, Google Analytics to track the traffic, etc.  
2. Only for Techies - Not for all.  

I feel that the second point is what keeps me interested in migrating to SSG. If there was a very simple website that claims to do everything and anyone can create a blog with that - I would probably have not tried that option :)  

### What powers this blog?

Below is the technology stack that runs this blog.  

1. Jekyll - Static Site Generator, written in Ruby  
2. Redcarpet - A Markdown plugin distributed as a ruby gem  
3. Pygments - A code highlighting plugin written in Python  
4. pageless_redirects - A plugin that creates the redirect URLs to ease the migration from blogger  
5. sitemap_generator - A plugin that generates/updates the sitemap for this blog  
6. rss.xml - An RSS feed for the blog  
7. MailChimp - To manage email subscriber lists & newsletters  
8. Disqus - A client-side commenting system to enable commenting feature  
9. VIM - VI Improved. My favorite editor for writing blog posts  
10. GitHub - A free hosting service that serves the HTML for this website  
11. BigRock - The DNS registrar in which the domain name smileprem.com is registered  

I used the very basic template that comes with Jekyll. I have plans to customize it in the future and also to add a custom search engine to my blog. I explored private pay-as-you-go hosting options as well. I may move my blog to private hosting sometime in the future when the blog grows big or if there are issues with GitHub hosting. But, that migration would be a breeze for me.  

If this sounds too technical, you may want to try the blogger.com.

### What difference did it make in my writing?

**Less Distraction** - I have the habit of previewing the blog every now and then and correcting the look and feel as I write. This has changed. I write from the VIM editor in the Unix console. I prefer to keep it in full screen and viola - there are no distractions. I could concentrate only on writing. I actually felt that I wrote more in the console than on a web page. Too early to come to a conclusion. Let's wait till I post at least 50+ posts this way.  I still have to preview and edit the blog post at the end. But that's now a single task after I complete the writing.  

**Feeling EPIC** - Yeah. Seriously. I fell in love with the character "Neo" in the Movie "The Matrix" when I saw it for the first time (esp. the black console with green text flowing down). I even wrote matrix screensavers in C, during my college days to simulate that experience on my computer. Those good old days are back. This simple act of blogging like a programmer brought back my love for programming. Write, Edit, Commit, Push - Viola, My blog is published. 

It's nostalgic.  
