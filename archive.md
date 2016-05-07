---
layout: page
date: 2013-12-12 00:00:00 +0530
title: Archive
permalink: /archive/
---
<div>
    <a href="{{ site.url }}">home</a> &nbsp;&gt;&nbsp; <a href="{{ site.url }}/archive">archive</a>
	<ul>
    {% for post in site.posts %}

		{% capture month %}{{ post.date | date: '%B' }}{% endcapture %}
		{% capture next_month %}{{ post.next.date | date: '%B' }}{% endcapture %}

		{% if month != next_month %}
			</ul>
			<h3>{{ post.date | date: '%B, %Y' }}</h3>
			<ul>
		{% endif %}
		<li>
			<p><a href="{{ post.url }}">{{ post.title }}</a></p>
		</li>
    {% endfor %}
	</ul>
</div>
