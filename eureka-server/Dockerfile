FROM openjdk:17

EXPOSE 8082

WORKDIR /eureka-server

ADD target/eureka-server-0.0.1.jar eureka-server-0.0.1.jar

ENTRYPOINT ["java","-jar","eureka-server-0.0.1.jar"]
