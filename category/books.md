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
		<li><p><a href="http://www.amazon.com/gp/product/B00SKG0GC8/ref=as_li_tl?ie=UTF8&camp=1789&creative=9325&creativeASIN=B00SKG0GC8&linkCode=as2&tag=smileprem-us-20&linkId=5S3CBZ6DLCE5ZBJ7" target="_blank">Gandhi: A Life Inspired</a></p></li>
		
		<li><p><a href="http://www.amazon.com/gp/product/B00CATSONE/ref=as_li_tl?ie=UTF8&camp=1789&creative=9325&creativeASIN=B00CATSONE&linkCode=as2&tag=smileprem-us-20&linkId=QPGIKLUCBAL6UIZJ" target="_blank">Nikola Tesla: Imagination and the Man That Invented the 20th Century</a></p></li>
		
		<li><p><a href="http://www.amazon.com/gp/product/0802136931?ie=UTF8&camp=1789&creativeASIN=0802136931&linkCode=xm2&tag=smileprem-us-20" target="_blank">The Book of the Penis</a></p></li>
		
		<li><p><a href="http://www.amazon.com/gp/product/1118657918?ie=UTF8&camp=1789&creativeASIN=1118657918&linkCode=xm2&tag=smileprem-us-20" target="_blank">Paleo Workouts For Dummies</a></p></li>
		
		<li><p><a href="http://www.amazon.com/gp/product/0671657860?ie=UTF8&camp=1789&creativeASIN=0671657860&linkCode=xm2&tag=smileprem-us-20" target="_blank">Many Lives, Many Masters</a></p></li>
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
