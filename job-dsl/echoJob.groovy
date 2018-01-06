freeStyleJob('echoJob') {

	parameters {
		stringParam('param', '', '')
	}

	concurrentBuild()

	steps {
		shell('''
			#!/bin/bash
			if echo "$param" | grep "C" | grep "fail"; then
				exit 1;
			fi;

			echo "$param"
			sleep 5
		''')
	}

}
