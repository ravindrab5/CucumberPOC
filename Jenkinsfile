node {
    stage('SCM') {
	echo 'Gathering code from version control'
	git branch: '${branch}', url: 'https://github.com/ravindrab5/CucumberPOC.git'
    }
    stage('Build') {
        echo 'Building....'
        sh './gradlew build'
    }
    stage('Test') {
        echo 'Testing....'
    }
    stage('Deploy') {
        echo 'Deploying....'
    }
}