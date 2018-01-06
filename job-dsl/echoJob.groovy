freeStyleJob('echoJob') {

	parameters {
		stringParam('param', '', '')
	}

	concurrentBuild()

	steps {
		shell('''
			echo "$param"
			sleep 10
		''')
	}

}
