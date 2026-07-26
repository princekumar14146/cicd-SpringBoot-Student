FROM eclipse-temurin:17-jre
LABEL authors="Prince"
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "app.jar"]
