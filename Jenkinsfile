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
                 sh 'docker tag demoservice studentdevelopersss/demoservice'
                 withDockerRegistry([ credentialsId: "docker-hub-credentials", url: "" ]) {
                   sh 'docker push studentdevelopersss/demoservice'
                 }
            }
        }
    }
}
