FROM openjdk:8-alpine

COPY target/uberjar/get-it.jar /get-it/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/get-it/app.jar"]
