FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/jgd-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} jgd_app.jar
ENTRYPOINT ["java", "-jar", "jgd_app.jar"]
