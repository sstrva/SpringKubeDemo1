pipeline {
    agent any
    tools {
        maven 'maven'
    }
    environment {
        DOCKERHUB_CREDENTIALS = credentials('dockerhub-cred')
        DOCKER_IMAGE_NAME = 'demoservice'
        DOCKER_TAG_NAME = 'studentdevelopersss/demoservice'
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
                sh 'docker build -t $DOCKER_IMAGE_NAME .'
                sh 'docker tag $DOCKER_IMAGE_NAME $DOCKER_TAG_NAME'
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
                sh 'docker push $DOCKER_TAG_NAME'
            }
        }
    }
    post {
        always{
            sh 'docker image rm $DOCKER_IMAGE_NAME'
            sh 'docker logout'
        }
    }
}
