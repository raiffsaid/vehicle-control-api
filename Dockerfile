FROM adoptopenjdk/openjdk11:alpine-slim
COPY target/vehicle-control-0.0.1-SNAPSHOT.jar vehicle-control.jar
ENTRYPOINT ["java", "-jar", "/vehicle-control.jar"]