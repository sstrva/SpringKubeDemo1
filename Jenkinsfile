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
                agent {
                    docker { 
                         args 'container ls' 
                    }
                 }
            }
            post {
                success {
                   echo 'Sucessfully build docker image'
              }
            }
        }
    }
   
}
