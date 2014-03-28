---
layout: default
date: 2013-12-12 00:00:00 +0530
title: Health - Premkumar Masilamani's personal blog
permalink: /category/health/
---

<div class="post">
    <h3>Category : Health</h3>

    {% for post in site.categories.health %}

	{% capture year %}{{ post.date | date: '%Y' }}{% endcapture %}
	{% capture next_year %}{{ post.next.date | date: '%Y' }}{% endcapture %}

	{% if year != next_year %}
		<h3>{{ post.date | date: '%Y' }}</h3>
	{% endif %}

	<p>{{ post.date | date_to_string }} &raquo; <a href="{{ post.url }}">{{ post.title }}</a></p>

    {% endfor %}
</div>
<br/>
