# Microservices with Spring Boot and Spring Cloud - Chapter 3 - Basic REST Services

    ./gradlew --warning-mode all build
    java -jar microservices/product-service/build/libs/*.jar &
    
    ./mvnw clean install -U
    ./mvnw spring-boot:run
    
    curl http://localhost:7002/product/123
    
    curl http://localhost:7001/product-composite/1
    curl http://localhost:7001/product-composite/1 -s | jq .


