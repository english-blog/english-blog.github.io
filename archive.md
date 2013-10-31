---
layout: default
title: Archive for Premkumar Masilamani's personal blog
permalink: /archive/
---

<div id="home">
  <h1>Blog Archive</h1>

  <ul class="posts">
    {% for post in site.posts %}
	{% capture year %}{{ post.date | date: '%Y' }}{% endcapture %}
	{% capture nyear %}{{ post.next.date | date: '%Y' }}{% endcapture %}
	{% if year != nyear %}
		<br/><h3>{{ post.date | date: '%Y' }}</h3>
	{% endif %}
	<li><span>{{ post.date | date_to_string }}</span> &raquo; <a href="{{ post.url }}">{{ post.title }}</a></li>
    {% endfor %}
  </ul>

</div>