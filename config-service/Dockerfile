FROM openjdk:17-oracle
VOLUME /temp
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]