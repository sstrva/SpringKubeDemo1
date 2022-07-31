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
            }
        }
        stage('Test'){
            steps {
                 echo 'Empty'
            }
        }
        stage('Push image to repository'){
              steps {
                 withCredentials([usernamePassword( credentialsId: 'dockerhub-cred', usernameVariable: 'USER', passwordVariable: 'PASSWORD')]) {
                            def registry_url = "registry.hub.docker.com/"
                            sh "docker login -u $USER -p $PASSWORD ${registry_url}"
                            sh 'docker tag demoservice studentdevelopersss/demoservice'
                            docker.withRegistry("http://${registry_url}", "docker-hub-credentials") {
                            // Push your image now
                            sh "docker push studentdevelopersss/demoservice"
                            }
                }       
            }
        }
    }
}
