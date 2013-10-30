---
layout: default
title: Books that enriched my life
permalink: /books/
---

<div id="home">
  <h1>Books I've read</h1>

  <ul class="posts">
    {% for post in site.categories.books %}
	{% capture year %}{{ post.date | date: '%Y' }}{% endcapture %}
	{% capture nyear %}{{ post.next.date | date: '%Y' }}{% endcapture %}
	{% if year != nyear %}
		<br/><h3>{{ post.date | date: '%Y' }}</h3>
	{% endif %}
	<li><span>{{ post.date | date_to_string }}</span> &raquo; <a href="{{ post.url }}">{{ post.title }}</a></li>
    {% endfor %}
  </ul>

</div>
