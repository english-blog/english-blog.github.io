---
layout: page
date: 2013-12-12 00:00:00 +0530
title: 
permalink: /category/social/
---

<div>
    <a href="{{ site.url }}">home</a>&nbsp;&gt;&nbsp;<a href="{{ site.url }}/categories">categories</a>&nbsp;&gt;&nbsp;<a href="{{ site.url }}/category/social/">social</a>
  	
	<ul>
    {% for post in site.categories.social %}
		<li><p><a href="{{ post.url }}">{{ post.title }}</a></p></li>
    {% endfor %}
	</ul>
	
</div>
