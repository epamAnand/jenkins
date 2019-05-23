package org.epam


class GitCli implements Serializable {
	def steps
	def config

	GitCli(steps, config) {
		this.steps = steps
	}

	def clone() {
		this.steps.git(
			branch: config.branch, 
			credentialsId: config.credential, 
			url: config.url
		)
	}
}