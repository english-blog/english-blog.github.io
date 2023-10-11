---
layout: empty
date: 2023-10-11 00:00:00 +0530
permalink: /feed/all.xml
---
<rss version="2.0" xmlns:atom="https://www.w3.org/2005/Atom">
	<channel>
		<title>{{ site.title }}</title>
		<link>{{ site.url }}</link>
		<description>{{ site.tagline }}</description>
		<copyright>{{site.copyright}}</copyright>
		<category>Blogs</category>
		<language>en-us</language>
		<pubDate>{{ site.time | date_to_rfc822  }}</pubDate>
		<lastBuildDate>{{ site.time | date_to_rfc822  }}</lastBuildDate>
		<atom:link href="{{ site.url }}/rss.xml" rel="self" type="application/rss+xml" />
		<docs>https://cyber.law.harvard.edu/rss/rss.html</docs>
		<generator>Jekyll Liquid Template in Github</generator>		
		<managingEditor>{{ site.email }} ({{ site.author }})</managingEditor>
		<webMaster>{{ site.email }} ({{ site.author }})</webMaster>
		{% for post in site.posts limit:1000 %}
			<item>
				<title>{{ post.title | xml_escape }}</title>
				<link>{{ site.url }}{{ post.url }}</link>
				<description>{{ post.content | xml_escape }}</description>
			{% if post.author-name != null %}
				<author>{{ post.author-email }} ({{ post.author-name }})</author>
			{% else %}
				<author>{{ site.email }} ({{ site.author }})</author>
			{% endif %}
				<category>{{ post.category }}</category>
				<pubDate>{{ post.date | date_to_rfc822  }}</pubDate>
				<guid>{{ site.url }}{{ post.url }}</guid>
			</item>
		{% endfor %}
	</channel>
</rss>
