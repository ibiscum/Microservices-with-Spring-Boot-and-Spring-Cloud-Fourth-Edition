# Microservices with Spring Boot and Spring Cloud - Chapter 3 - Spring Init

## Gradle

    ./gradlew :microservices:product-composite-service:build; \
    ./gradlew :microservices:product-service:build; \
    ./gradlew :microservices:recommendation-service:build; \
    ./gradlew :microservices:review-service:build;

    ./gradlew :microservices:product-composite-service:bootRun --enable-native-access=ALL-UNNAMED
    ./gradlew :microservices:product-service:bootRun --enable-native-access=ALL-UNNAMED

    ./gradlew dependencies --write-locks

## Maven

    ./mvnw -N wrapper:wrapper -Dmaven=3.9.15
    ./mvnw clean install -U
    ./mvnw spring-boot:run
