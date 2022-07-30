pipeline {
    agent { docker { image 'maven:3.8.4-openjdk-11-slim' } }
    stages {
        stage('Build maven package') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Build docker image') {
            agent {
                docker {
                    build 'demoservice'
                }
            }
        }
        stage('Test') {
            echo 'Testing'
        }
    }
}
