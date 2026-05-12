# Microservices with Spring Boot and Spring Cloud - Chapter 3 - Basic REST Services

    ./gradlew --warning-mode all build
    java -jar microservices/product-service/build/libs/*.jar &
    
    ./mvnw clean install -U
    ./mvnw spring-boot:run
    
    curl http://localhost:7002/product/123
    
    curl http://localhost:7001/product-composite/1
    curl http://localhost:7001/product-composite/1 -s | jq .

## Verify that a 404 (Not Found) error is returned for a non-existing productId (13)

    curl http://localhost:7001/product-composite/13 -i

## Verify that no recommendations are returned for productId 113
    
    curl http://localhost:7001/product-composite/113 -s | jq .

## Verify that no reviews are returned for productId 213
    
    curl http://localhost:7001/product-composite/213 -s | jq .

## Verify that a 422 (Unprocessable Entity) error is returned for a productId that is out of range (-1)
    
    curl http://localhost:7001/product-composite/-1 -i

## Verify that a 400 (Bad Request) error is returned for a productId that is not a number, i.e. invalid format
    
    curl http://localhost:7001/product-composite/invalidProductId -i
