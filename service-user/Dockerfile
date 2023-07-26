FROM openjdk:17

EXPOSE 8082

WORKDIR /service-user

ADD target/service-user-0.0.1.jar service-user-0.0.1.jar

ENTRYPOINT ["java","-jar","service-user-0.0.1.jar"]
