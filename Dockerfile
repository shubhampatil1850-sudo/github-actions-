FROM openjdk:21
EXPOSE 8080
ADD target/ecs-fargate.jar ecs-fargate.jar
ENTRYPOINT ["java","-jar","/ecs-fargate.jar"]