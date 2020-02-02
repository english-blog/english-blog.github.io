---
layout: page
date: 2020-01-31 00:00:00 +0530
title: 
permalink: /category/math/
---

<div>
  	<a href="{{ site.url }}">home</a>&nbsp;&gt;&nbsp;<a href="{{ site.url }}/categories">categories</a>&nbsp;&gt;&nbsp;<a href="{{ site.url }}/category/math/">math</a>
	<ul>
    {% for post in site.categories.math %}
		<li><p><a href="{{ post.url }}">{{ post.title }}</a></p></li>
    {% endfor %}
	</ul>
</div>
