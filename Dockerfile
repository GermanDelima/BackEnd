FROM openjdk:17-jdk-slim
MAINTAINER JGD
COPY target/jgd-0.0.1-SNAPSHOT.jar jgd-app.jar
ENTRYPOINT ["java","-jar","/jgd-app.jar"]



