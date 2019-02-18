FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/demo-microservice-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
