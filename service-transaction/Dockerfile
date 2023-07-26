FROM openjdk:17

EXPOSE 8082

WORKDIR /service-transaction

ADD target/service-transaction-0.0.1.jar service-transaction-0.0.1.jar

ENTRYPOINT ["java","-jar","service-transaction-0.0.1.jar"]
