---
layout: default
date: 2013-12-12 00:00:00 +0530
title: Self Improvement - Premkumar Masilamani's personal blog
permalink: /category/self-improvement/
---

<div class="post">
    <h3>Category : Self Improvement</h3>

    {% for post in site.categories.self-improvement %}

	{% capture year %}{{ post.date | date: '%Y' }}{% endcapture %}
	{% capture next_year %}{{ post.next.date | date: '%Y' }}{% endcapture %}

	{% if year != next_year %}
		<h3>{{ post.date | date: '%Y' }}</h3>
	{% endif %}

	<p>{{ post.date | date_to_string }} &raquo; <a href="{{ post.url }}">{{ post.title }}</a></p>

    {% endfor %}
</div>
<br/>
