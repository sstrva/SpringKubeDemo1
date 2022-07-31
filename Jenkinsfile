pipeline {
    agent any
    tools {
        maven 'maven_3_8_6'
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
                sh 'docker build -t demoservice .'
            }
        }
        stage('Test'){
            steps {
                 echo 'Empty'
            }
        }
    }
}
