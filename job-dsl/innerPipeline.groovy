pipelineJob('innerPipeline') {
	definition {
		cpsScm {
			scm {
				git {
					remote {
						url('https://github.com/dkwasny/JenkinsSandbox.git')
					}
				}
				scriptPath('pipelines/innerPipeline')
			}
		}
	}
}
