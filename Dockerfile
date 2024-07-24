FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/jgd-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} jgd_app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "jgd_app.jar"]
