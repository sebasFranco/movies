FROM openjdk:13-jdk-alpine
VOLUME /tmp
EXPOSE 8082
ADD ./build/libs/movies-0.0.1-SNAPSHOT.jar /app/movie-service.jar
ENTRYPOINT ["java","-jar", "/app/movie-service.jar"]