---
layout: post
title: Blog like a Programmer !
date: 30-10-2013
---
[If you are not a programmer, this article may not interest you. Please skip and do something useful]  

## What is a blog?

A personal website through which a person expresses his opinions / ideas with the world on a regular basis.  

## What constitues a simple basic blog?

Below are the basic components of any blogging system.  

1. Set of blog posts arranged in chronological order 
2. Set of pages  
3. Ability for the readers to comment in the blog post/pages  

I am not bothered about the awesome SEO plugins / other helpful plugins which helps in many aspects of blogging. I am concerned only about the simple basic blog. All I need is a simple webpage to express my ideas.  

## Do I need a CMS / Server side engine?  

Except the comments section, rest of the blogs is static. I am not bothered about the comments anyway. It takes too much of your time away from blogging. If you really need them, there are client side commenting systems available (like Disqus, Facebook comments et.,). So, I dont need a server side code which connects to a database, execute the plugins, create the webpage on the fly for every request to a webpage or post (even with caching), when all I need is a set of simple HTML files.  

There is an argument that says, *"Infrastructure is cheap now a days. The computing and storage abilities skyrocketed. We can use as much as we want"*. Yes. It is. But, just because I have too much fuel, I would not travel 10 miles extra to office everyday. I always prefer the shortest possible route. How about you?. And again, thats a personal choice. I am not saying that what is being done is wrong, all I say that I dont need all of those.

## What I did not like in regular blogging systems?  

These are the two components of a blogging system which I did not prefer to use. There are thousands of fellow bloggers who would die to use these. :)

1. CMS / Server Side engine  
2. WYSIWYG editors  

I simply hate the un-necessary markups created by the default editors or even the specialized installable editors in the market. To display an image to the left side of the html, this is the code created by blogger.

{% highlight html wrap %}
<div class="separator" style="clear: both; text-align: center;">
<a href="http://1.bp.blogspot.com/-TIbnnU81F6I/UkhN_lONq6I/AAAAAAAAV-c/fL-BdakCXW8/s1600/
100-Ways-to-Motivate-Yourself-Chandler-Steve.jpg" imageanchor="1" style="clear: left; 
float: left; margin-bottom: 1em; margin-right: 1em;"><img border="0" height="318"
 src="http://1.bp.blogspot.com/-TIbnnU81F6I/UkhN_lONq6I/AAAAAAAAV-c/fL-BdakCXW8/s320/
100-Ways-to-Motivate-Yourself-Chandler-Steve.jpg" width="320" /></a></div>
{% endhighlight %}

where all I need is 

{% highlight html wrap %}
<img style="clear: left; float: left; margin-bottom: 1em; margin-right: 1em;" 
src="{{site.url}}/img/image.jpg"/>   
{% endhighlight  %}

You see the point?. Most dont mind this additional markups. I do mind, when I edit the blogposts.

## Alternatives  

I could find hundreds of alternatives in the opensource area.

