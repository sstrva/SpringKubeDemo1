pipeline {
    agent any
    tools {
        maven 'maven'
    }    
    options {
        skipStagesAfterUnstable()
    }
    stages {
         stage('Clone Repository') { 
            steps { 
                script {
                     checkout scm
                }
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package'
                sh 'docker build -t demoservice .'
                sh 'docker tag demoservice studentdevelopersss/demoservice'
            }
        }
        stage('Test'){
            steps {
                 echo 'Empty'
            }
        }
        stage('Push image to repository'){
                steps {
                     docker.withRegistry("http://registry.hub.docker.com/", "docker-hub-credentials") {
                         sh "docker push studentdevelopersss/demoservice"
                }
            }
        }
    }
}
