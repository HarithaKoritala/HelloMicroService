FROM openjdk:17
EXPOSE 8080
ADD target/HelloMicroService-0.0.1-SNAPSHOT.jar HelloMicroService-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/HelloMicroService-0.0.1-SNAPSHOT.jar"]
