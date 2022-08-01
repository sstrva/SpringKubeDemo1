pipeline {
    agent any
    tools {
        maven 'maven'
    }
    environment {
        DOCKERHUB_CREDENTIALS = credentials('dockerhub-cred')
    }
    options {
        skipStagesAfterUnstable()
    }
    stages {
         stage('Clone Github Repository') { 
            steps { 
                script {
                     checkout scm
                }
            }
        }
        stage('Build image') { 
            steps {
                sh 'mvn -B -DskipTests clean package'
                sh 'docker build -t demoservice .'
                sh 'docker tag demoservice studentdevelopersss/demoservice'
            }
        }
        stage('Test') {
            steps{
                echo 'Test empty'
            }
        }
        stage('Push image to Dockerhub'){
            steps{
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
                sh 'docker push studentdevelopersss/demoservice'
            }
        }
    }
    post {
        always{
            sh 'docker logout'
        }
    }
}
