FROM openjdk:16-jdk-alpine
COPY ./target/SpringKubeDemo1-0.0.1-SNAPSHOT.jar SpringKubeDemo1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","SpringKubeDemo1-0.0.1-SNAPSHOT.jar"]