# Stage 1: Build the application
FROM maven:3.9.6-amazoncorretto-21 AS build
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Create the runtime image
FROM amazoncorretto:21-alpine-jdk
EXPOSE 8080
# Copy the jar from the 'build' stage.
# NOTE: Ensure 'ecsfargate.jar' matches the <finalName> in your pom.xml
COPY --from=build /target/*.jar ecs-fargate.jar
ENTRYPOINT ["java", "-jar", "/ecs-fargate.jar"]