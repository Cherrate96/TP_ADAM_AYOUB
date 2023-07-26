FROM openjdk:17

EXPOSE 8082

WORKDIR /service-account

ADD target/service-account-0.0.1.jar service-account-0.0.1.jar

ENTRYPOINT ["java","-jar","service-account-0.0.1.jar"]
