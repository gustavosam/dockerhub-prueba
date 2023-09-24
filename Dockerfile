FROM openjdk:11

EXPOSE 9810:9810

COPY ./target/demo-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]