FROM openjdk:17

EXPOSE 8082

WORKDIR /service-feedback

ADD target/service-feedback-0.0.1.jar service-feedback-0.0.1.jar

ENTRYPOINT ["java","-jar","service-feedback-0.0.1.jar"]
