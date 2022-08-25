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
        stage('Test') {
            steps {
                script{
                    def checkIfContainerExists = sh script: 'docker container ls -all -f name=^/$DOCKER_CONTAINER_NAME$', returnStatus:true
                    if (checkIfContainerExists == 0){
                        echo 'it doesnt exists'
                    }
                    else{
                        echo 'it does exists'
                    }
                }
                echo 'API testing begins'
                sh 'docker run -d -p 8081:8080 --rm --name $DOCKER_CONTAINER_NAME --network net $DOCKER_IMAGE_NAME'
                sh 'docker run -t --rm --name postman --network net postman/newman run $POSTMAN_URL_LINK'
                sh 'docker stop $DOCKER_CONTAINER_NAME'
            }
        }
    }
}
