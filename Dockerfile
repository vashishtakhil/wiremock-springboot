FROM openjdk:8-alpine

## Add created JAR to image
ADD target/*.jar /app.jar
ADD target/classes/application.yml /application.yml

## Expose wiremock server PORT
EXPOSE 8089

## Default command to be executed when the container is deployed
ENTRYPOINT ["java"]
CMD ["-jar","/app.jar"]
