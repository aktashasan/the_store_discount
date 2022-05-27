FROM openjdk:17.0.2
ADD ./target/*.jar /usr/src/app.jar
WORKDIR /usr/src
ENTRYPOINT ["java","-jar", "app.jar"]