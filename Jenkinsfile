pipeline {
    environment {
        repoName = 'pronoy911/demo'
        registryCredential = 'docker-hub'
        dockerImage = ''
    }
    agent any

    stages {
        stage('cloning git') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/pronoy-bose/demo.git'
            }
        }
        stage('build maven project') {
            steps {
                // Run Maven on a Unix agent.
                // sh "mvn -Dmaven.test.failure.ignore=true install"

                // To run Maven on a Windows agent, use
                bat "mvn -Dmaven.test.failure.ignore=true clean install"
            }
        }
        stage('Build image') {
          steps{
            script {
              dockerImage = docker.build repoName + ":$BUILD_NUMBER"
            }
          }
        }
        stage('Deploy Image') {
          steps{
            script {
              docker.withRegistry( '', registryCredential ) {
                dockerImage.push()
              }
            }
          }
        }
    }
}
