#inicia con la imagen base que contiene Java runtime
FROM openjdk:17-jdk-slim as build

# se agrega el jar del microservicio al contenedor (del mismo nombre)
#COPY target/hotels-0.1.0-SNAPSHOT.jar hotels-0.1.0-SNAPSHOT.jar
COPY target/ms-hotels-0.1.0-SNAPSHOT.jar ms-hotels-0.1.0-SNAPSHOT.jar

#se ejecuta el microservicio
ENTRYPOINT ["java","-jar","/ms-hotels-0.1.0-SNAPSHOT.jar"]