pipelineJob('outerPipeline') {
	definition {
		cpsScm {
			scm {
				git('https://github.com/dkwasny/JenkinsSandbox.git')
				scriptPath('pipelines/outerPipeline')
			}
		}
	}
}
