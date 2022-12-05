FROM maven:3-openjdk-17 as builder

WORKDIR /app
COPY . /app
RUN mvn package -DskipTests=true

FROM openjdk:17
WORKDIR /app
COPY --from=builder /app/target/server.jar .
CMD ["java", "-jar", "server.jar", "--spring.profiles.active=docker"]