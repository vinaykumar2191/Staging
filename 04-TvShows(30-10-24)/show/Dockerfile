FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/show-0.0.1-SNAPSHOT.jar tvShows.jar

EXPOSE 7070

ENTRYPOINT ["java", "-jar", "tvShows.jar"]