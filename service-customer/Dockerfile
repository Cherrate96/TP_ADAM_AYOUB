FROM openjdk:17

EXPOSE 8082

WORKDIR /service-customer

ADD target/service-customer-0.0.1.jar service-customer-0.0.1.jar

ENTRYPOINT ["java","-jar","service-customer-0.0.1.jar"]
