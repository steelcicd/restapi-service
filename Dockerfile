FROM amazoncorretto:17.0.14-alpine
COPY target/restapi-service-1.0.0.jar restapi-service.jar
ENTRYPOINT ["java","-jar","/restapi-service.jar"]