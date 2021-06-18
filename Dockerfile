FROM openjdk:11
COPY target/vehicle-control-0.0.1-SNAPSHOT.jar vehicle-control-1.0.0.jar
ENTRYPOINT ["java", "-jar", "/vehicle-control-1.0.0.jar"]