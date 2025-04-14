FROM amazoncorretto:17.0.14-alpine
COPY target/restapi-service.jar restapi-service.jar
ENTRYPOINT ["java","-jar","/restapi-service.jar"]