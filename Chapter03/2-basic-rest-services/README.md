# Microservices with Spring Boot and Spring Cloud - Chapter 3 - Basic REST Services

    ./gradlew --warning-mode all build
    java -jar microservices/product-service/build/libs/*.jar &
    curl http://localhost:7002/product/123
    kill $(jobs -p)
