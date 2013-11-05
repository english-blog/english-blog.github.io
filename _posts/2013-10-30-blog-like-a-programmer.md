---
layout: post
title: Blog like a Programmer
date: 30-10-2013
category: technology
---
<div style="text-align: center;">
<img src="{{site.url}}/img/computer-programmer-hacking-screen.jpg"/>
</div>  

[If you are not a programmer, this article may not interest you. Please skip and do something useful]  

## What is a blog?

A personal website through which a person expresses his opinions / ideas with the world on a regular basis.  

## What constitues a simple, basic blog?

Below are the basic components of any blogging system.  

1. Set of blog posts arranged in chronological order 
2. Set of pages  
3. Ability for the readers to comment in the blog post/pages  

I am not bothered about the awesome SEO plugins / other helpful plugins which helps in many aspects of blogging. I am concerned only about the basic blog. All I need is a simple webpage to express my ideas.  

## Do I need a CMS / Server side engine?  

Except the comments section, rest of the blog is static. I am not bothered about the comments anyway. It takes too much of your time away from blogging. If you really need them, there are client side commenting systems available (like Disqus, Facebook comments etc.,). So, I dont need a server side code which connects to a database, execute the plugins, create the webpage on the fly for every request to a webpage (even with caching), when all I need is a set of simple HTML file.  

There is an argument that says, *"Infrastructure is cheap now a days. The computing and storage abilities skyrocketed. We can use as much as we want"*. Yes. It is. But, just because I have too much fuel, I would not travel 10 miles extra to office everyday. I always prefer the shortest possible route. How about you?. And again, thats a personal choice. I am not saying that what is being done is wrong, all I say is that I don't need all of those.  

## What I did not like in regular blogging systems?  

These are the two components of any regular blogging system which I do not prefer to use. However, there are thousands of fellow bloggers who would die to use these. :)  

1. CMS / Server Side engine  
2. WYSIWYG editors  

When it comes to WYSIWYG editors, I simply hate the un-necessary markups created by the default editors or even the specialized installable editors in the market. For ex. to display an image to the left side of the html, this is the code created by blogger.  

{% highlight html wrap %}
<div class="separator" style="clear: both; text-align: center;">
<a href="http://1.bp.blogspot.com/-TIbnnU81F6I/UkhN_lONq6I/AAAAAAAAV-c/fL-BdakCXW8/s1600/100-Ways-to-Motivate-Yourself-Chandler-Steve.jpg" imageanchor="1" style="clear: left; float: left; margin-bottom: 1em; margin-right: 1em;"><img border="0" height="318" src="http://1.bp.blogspot.com/-TIbnnU81F6I/UkhN_lONq6I/AAAAAAAAV-c/fL-BdakCXW8/s320/100-Ways-to-Motivate-Yourself-Chandler-Steve.jpg" width="320" /></a></div>
{% endhighlight %}  
  
where all I need is  
  
{% highlight html %}
<img style="clear: left; float: left; margin-bottom: 1em; margin-right: 1em;" 
src="{{site.url}}/img/image.jpg"/>
{% endhighlight %}  
  

You see the point?. Most don't mind this additional markups. I do mind, when I edit the blogposts.  

## Alternatives - Static Site Generators 

Static Site Generator is a program which generates a complete HTML website as output. The input would be few configuration files, layout files and markdown or simple html files. You can simply upload these HTML files to any webserver and your blog is live. whooh...  

I could find hundreds of SSGs written in various languages (ruby, python, node.js, javascript, java etc) in the opensource area. Since I do not know most of the programming languages, but decided to learn any one of them - I choose the most widely used SSG. [Jekyll][jekyl-url], which powers [GitHub][github-url]. Seeing hundreds of plugins / websites out there for Jekyll already, I was confident that I would not be stuck any problem for a long time.  

[jekyl-url]: http://jekyllrb.com
[github-url]: http://github.com

## Markdown

Markdown is a program or a plugin which transforms the plain text to a valid HTML / XHTML. As with any opensource, there are many alternatives. I choose to use "redcarpet", since this is the default Markdown processor that comes with Jekyll. The HTML produced by Markdown is the bare minimum HTML needed to render the page effectively in any browser. You have the option of using HTML directly in the Markdown text files, if you feel that is needed.  

## Advantages of Static Site Generators

Some of the key advantages of using SSG are  

1. **Security** - No one can / will hack HTML. he he he... There is nothing to hide and no need to fear someone hacking your website.  
2. **Performance** - No server side code. No CMS. Lighting fast.  
3. **Portability** - Simply copy paste the HTML to another host.  
4. **Local Copy** - You always have a local copy of the website in your computer all the time. No need to worry about the server crash.  
5. **Version Controlled Source** - You have the option to version control your entire website with any version control systems like subversion, git etc,. I choose to keep the source in GitHub. This means that you never lose any single line of change made in your blog.  
6. **Free hosting with custom domain** - If all you need is a simple effective blog, you can host it for free with GitHub. The best part is that you can use your own domain with GitHub pages.  

and many more ...  

## Disadvantages of Static Site Generators

Some of the disadvantages of SSG are  

1. Any operation that was performed on the server is not possible. But there are alternatives likes, client side comments, google custom search to search the website, google analytics to track the traffic etc.  
2. Only for Techies - Not for all.  

I feel that the second point is what keeps me interested in migrating to SSG. If there was a very simple website which claims to do everything and anyone can create a blog with that - I would probably have not tried that option :)  

## What powers this blog?

Below is that technology stack that runs this blog.  

1. Jekyll - Static Site Generator written in Ruby  
2. Redcarpet - A Markdown plugin distributed as ruby gem  
3. Pygments - A code highlighting plugin written in Python  
4. pageless_redirects - A plugin which creates the redirect URLs to ease the migration from blogger  
5. sitemap_generator - A plugin which generates/updates sitemap for this blog  
6. feed.xml - An RSS feed for the blog  
7. MailChimp - To manage email subscriber lists & newsletters  
8. Disqus - A client side commenting system to enable commenting feature  
9. VIM - VI Improved. My favorite editor for writing blog posts  
10. GitHub - A free hosting service which serves the HTML for this website  
11. BigRock - The DNS registrar in which the domain name smileprem.com is registered  

I used the very basic template that comes with Jekyll. I have plans to customize it in future and also to add a custom search engine to my blog. I explored private pay-as-you-go hosting options as well. I found <http://www.hostingreborn.com> to be very good. I may move my blog to private hosting sometime in future, when the blog grows big or if there are issues with GitHub hosting. But, that migration would be a breeze for me.  

## What difference did it make to my writing?

**Less Distraction** - I have the habit of previewing the blog every now and then and correct the look and feel as I write. This is changed. I write from VIM editor in Unix console. I prefer to keep it in full screen and viola - there are no distractions. I could concentrate only on writing. I actually felt that I write more in console than in a webpage. Too early to come to a conclusion. Lets wait till I post atlease 50+ posts this way.  I still have to preview and edit the blog post in the end. But thats now a single task after I complete the writing.  

**Feeling EPIC** - Yeah. Seriously. I fell in love with the character "Neo" in the Movie "The Matrix" when I saw it the first time (esp. the black console with green text flowing down). I even wrote matirx screensavers in C, during my college days to simulate that experience in my computer. Those good old days are back. This simple act of blogging like a programmer, brought back my love for programming. Write, Edit, Commit, Push - Viola, My blog is published. It's nostalgic. This is my console where I wrote this blog post.  

<div style="text-align: center;">
<img src="{{site.url}}/img/bloggin-from-vim.jpg"/>
</div><div style="margin-bottom:1em;"></div>  


