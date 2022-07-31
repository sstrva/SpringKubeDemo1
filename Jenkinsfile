pipeline {
    agent {
        docker {
            image 'maven:3.8.1-adoptopenjdk-11'
        }
    }
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
                sh 'mvn -B -DskipTests clean package'
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
