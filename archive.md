---
layout: default
date: 2013-12-12 00:00:00 +0530
title: Archive for Premkumar Masilamani's personal blog
permalink: /archive/
---

<div class="post">
    <h3>Blog Archive</h3>

    {% for post in site.posts %}

	{% capture month %}{{ post.date | date: '%B' }}{% endcapture %}
	{% capture next_month %}{{ post.next.date | date: '%B' }}{% endcapture %}

	{% if month != next_month %}
		<h3>{{ post.date | date: '%B, %Y' }}</h3>
	{% endif %}

	<p>{{ post.date | date_to_string }} &raquo; <a href="{{ post.url }}">{{ post.title }}</a></p>

    {% endfor %}
</div>
<br/>
