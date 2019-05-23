package org.epam


class Build implements Serializable {
	def steps
	def config

	Build(steps, config) {
		this.steps = steps
	}

	def clone(args) {
		this.steps.sh config.command
	}
}