FROM openjdk:17-jdk-slim
LABEL maintainer="jgd"
WORKDIR /app
COPY target/jgd-0.0.1-SNAPSHOT.jar jgd-app.jar
ENTRYPOINT ["java", "-jar", "/app/jgd-app.jar"]



