FROM openjdk:17

EXPOSE 8082

WORKDIR /api-gateway

ADD target/api-gateway-0.0.1.jar api-gateway-0.0.1.jar

ENTRYPOINT ["java","-jar","api-gateway-0.0.1.jar"]
