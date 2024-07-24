FROM amazoncorretto:17-alpine-jdk
MAINTAINER JGD

# Crear y usar un directorio de trabajo
WORKDIR /app

# Copiar el JAR de la aplicación al contenedor
COPY target/jgd-0.0.1-SNAPSHOT.jar jgd_app.jar

# Comando de entrada para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "jgd_app.jar"]
