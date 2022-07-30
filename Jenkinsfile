pipeline {
    agent {
        docker {
            image 'maven:3.8.1-adoptopenjdk-11' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package'
                sh 'docker build -t demoservice .'
            }
            post {
                success {
                   echo 'Sucessfully build docker image'
              }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing'
            }
            post {
                success {
                   echo 'Test successful'
              }
            }
        }
    }
   
}
