FROM openjdk:17
WORKDIR /apps
COPY ./target/aws-ecs-order-ci-cd-0.0.1-SNAPSHOT.jar /apps/order-service.jar
EXPOSE 8080
CMD [ "java","-jar" "order-service.jar"]
