FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN maven clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/portfolio-0.0.1-SNAPSHOT.jar /portfolio.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/portfolio.jar"]
# docker build -t portfolio .

