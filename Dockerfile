# Usa la imagen de OpenJDK 11 como base
FROM adoptopenjdk:11-jre-hotspot

# Copia el archivo JAR de tu aplicación Spring Boot al contenedor
COPY target/demo-0.0.1-SNAPSHOT.jar /app.jar

# Expone el puerto en el que se ejecutará tu aplicación Spring Boot
EXPOSE 9810:9810

# Comando para ejecutar la aplicación cuando se inicie el contenedor
CMD ["java", "-jar", "/app.jar"]
