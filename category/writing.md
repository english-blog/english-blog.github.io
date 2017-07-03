---
layout: page
date: 2016-11-07 00:00:00 +0530
title: 
permalink: /category/writing/
---

<div>
  	<a href="{{ site.url }}">home</a>&nbsp;&gt;&nbsp;<a href="{{ site.url }}/categories">categories</a>&nbsp;&gt;&nbsp;<a href="{{ site.url }}/category/writing/">writing</a>
	<ul>
    {% for post in site.categories.writing %}
		<li><p><a href="{{ post.url }}">{{ post.title }}</a></p></li>
    {% endfor %}
	</ul>
</div>
