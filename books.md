---
layout: default
title: Books that enriched my life
permalink: /books/
---

<div class="post">
    <h3>Books I've read</h3>

    {% for post in site.categories.books %}

	{% capture month %}{{ post.date | date: '%B' }}{% endcapture %}
	{% capture next_month %}{{ post.next.date | date: '%B' }}{% endcapture %}

	{% if month != next_month %}
		<h3>{{ post.date | date: '%B, %Y' }}</h3>
	{% endif %}

	<p>{{ post.date | date_to_string }} &raquo; <a href="{{ post.url }}">{{ post.title }}</a></p>

    {% endfor %}
</div>
<br/>
