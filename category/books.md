---
layout: page
date: 2013-12-12 00:00:00 +0530
title: 
permalink: /category/books/
---

<div>
    <a href="{{ site.url }}">home</a>&nbsp;&gt;&nbsp;<a href="{{ site.url }}/categories">categories</a>&nbsp;&gt;&nbsp;<a href="{{ site.url }}/category/books/">books</a>

	<ul>
		<li><p>Gandhi: A Life Inspired</p></li>
		
		<li><p>Nikola Tesla: Imagination and the Man That Invented the 20th Century</p></li>
		
		<li><p>The Book of the Penis</p></li>

		<li><p>Many Lives, Many Masters</p></li>

	{% for post in site.categories.books %}
		<li><p><a href="{{ post.url }}">{{ post.title }}</a></p></li>
    {% endfor %}
	</ul>
</div>
