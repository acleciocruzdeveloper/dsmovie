FROM maven:3.9-amazoncorretto-17 as build

WORKDIR /app

COPY . .

RUN ["sh", "-c", "mvn clean package -DskipTests || true", "-X", "-e"]

FROM amazoncorretto:17-alpine
WORKDIR /app
COPY    --from=build /app/target/*.jar app.jar
ENV SPRING_PROFILES_ACTIVE=test

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]