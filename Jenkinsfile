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
        stage('Build maven app') { 
            steps { 
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Build Docker image') { 
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
