---
layout: page
date: 2016-05-07 00:00:00 +0530
title: Sitemap
permalink: /sitemap/
---
<div>
    <a href="{{ site.url }}">home</a> &nbsp;&gt;&nbsp; <a href="{{ site.url }}/sitemap/">sitemap</a>
	
	 {% for category in site.categories %}
     <div>
          <h3>{{ category | first }}</h3>
          <ul>
             {% for posts in category %}
               {% for post in posts %}
                 {% if post.url %}
                   <li>
						<p><a href="{{ post.url }}">{{ post.title }}</a></p>
                   </li>
                {% endif %}
              {% endfor %}
            {% endfor %}
         </ul>
     </div>
 {% endfor %}
 <br>
</div>
