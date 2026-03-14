# Microservices with Spring Boot and Spring Cloud - Chapter 3 - Basic REST Services

    ./gradlew --warning-mode all build
    java -jar microservices/product-service/build/libs/*.jar &
    curl http://localhost:7002/product/123
    kill $(jobs -p)

    java --enable-native-access=ALL-UNNAMED -jar microservices/product-composite-service/build/libs/*.jar &
    java --enable-native-access=ALL-UNNAMED -jar microservices/product-service/build/libs/*.jar &
    java --enable-native-access=ALL-UNNAMED -jar microservices/recommendation-service/build/libs/*.jar &
    java --enable-native-access=ALL-UNNAMED -jar microservices/review-service/build/libs/*.jar &

    curl http://localhost:7001/product-composite/1
    curl http://localhost:7001/product-composite/1 -s | jq .


