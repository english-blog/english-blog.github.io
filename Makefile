# Phony targets ensure commands associated with target are run regardless of file state.
.PHONY: run stop

# This target will run the Jekyll service.
run:
	@docker run -d --name smileprem-english \
	-e JEKYLL_ENV=docker \
	-e PAGES_REPO_NWO=english-blog/english-blog.github.io \
	-p 4000:4000 \
	-v ${PWD}:/srv/jekyll \
	jekyll/jekyll:4.2.0 \
	jekyll serve --config _local-config.yml --watch --incremental --drafts

# This target will stop and remove the Jekyll container.
stop:
	@docker stop smileprem-english && docker rm smileprem-english
