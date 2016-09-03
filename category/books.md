---
layout: page
date: 2013-12-12 00:00:00 +0530
title: Library
permalink: /category/books/
---

<div>
    <a href="{{ site.url }}">home</a> &nbsp;&gt;&nbsp; <a href="{{ site.url }}/categories">categories</a>

    <h3>Books read, not yet reviewed</h3>
	<ul>
		<li><p>Gandhi: A Life Inspired</p></li>
		
		<li><p>Nikola Tesla: Imagination and the Man That Invented the 20th Century</p></li>
		
		<li><p>The Book of the Penis</p></li>

		<li><p>Many Lives, Many Masters</p></li>
	</ul>
	
	<ul>
    {% for post in site.categories.books %}

    	{% if forloop.index == 0 %}
    		{% assign prev_month = "none" %}
    	{% endif %}

		{% capture current_month %}{{ post.date | date: '%B' }}{% endcapture %}

		{% if prev_month != current_month %}	
			</ul>
			<h3>{{ post.date | date: '%B, %Y' }}</h3>
			<ul>
		{% endif %}	
		<li>
			<p><a href="{{ post.url }}">{{ post.title }}</a></p>
		</li>
		{% assign prev_month = current_month %}

    {% endfor %}
	</ul>
</div>
