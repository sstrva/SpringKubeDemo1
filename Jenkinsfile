pipeline {
    agent any
    tools {
        maven 'maven'
    }
    environment {
        DOCKERHUB_CREDENTIALS = credentials('dockerhub-cred')
        DOCKER_IMAGE_NAME = 'demoservice'
        DOCKER_CONTAINER_NAME = 'demoservice2'
        DOCKER_TAG_NAME = 'studentdevelopersss/demoservice'
        POSTMAN_URL_LINK = 'https://www.getpostman.com/collections/73824c24cc8ebd97f972'
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
            steps {
                echo 'API testing begins'
                sh 'docker run -d -p 8081:8080 --rm --name $DOCKER_CONTAINER_NAME --network net $DOCKER_IMAGE_NAME'
                sh 'docker run -t --rm --name postman --network net postman/newman run $POSTMAN_URL_LINK'
                sh 'docker stop $DOCKER_CONTAINER_NAME'
                echo 'API Testing ended'
            }
        }
        stage('Push image to Dockerhub'){
            steps {
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
