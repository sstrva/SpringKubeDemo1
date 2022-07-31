pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
         stage('Clone Repository') { 
            steps { 
                script{
                     checkout scm
                }
            }
        }
        stage('Build') { 
            steps {
                script {
                   app = docker.build("demoservice1")
                }
            }
        }
        stage('Test'){
            steps {
                 echo 'Empty'
            }
        }
    }
}
