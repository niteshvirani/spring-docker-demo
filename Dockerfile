FROM openjdk:17-jdk

WORKDIR /app

COPY target/spring-docker-demo-1.0.jar /app/spring-docker-demo.jar

EXPOSE 8080

CMD ["java", "-jar", "spring-docker-demo.jar"]