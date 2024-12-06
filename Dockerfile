FROM openjdk:22-jdk

COPY target/hello_docker-2.jar app.jar

CMD ["java", "-jar", "/app.jar"]