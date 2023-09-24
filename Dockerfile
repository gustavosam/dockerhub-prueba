FROM openjdk:11

COPY "./target/demo-0.0.1-SNAPSHOT.jar" "app.jar"

EXPOSE 9810:9810

ENTRYPOINT ["java","-jar","app.jar"]