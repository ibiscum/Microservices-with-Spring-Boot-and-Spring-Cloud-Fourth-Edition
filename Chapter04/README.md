# Microservices with Spring Boot and Spring Cloud - Chapter 4

    docker run -t --rm -v ${PWD}:/app zavoloklom/dclint ./docker-compose.yml

    echo 'Runtime.getRuntime().availableProcessors()' | docker run --rm -i eclipse-temurin:24 jshell -q
    echo 'Runtime.getRuntime().availableProcessors()' | docker run --rm -i --cpus=3 eclipse-temurin:24 jshell -q
    docker run -it --rm eclipse-temurin:24 java -XX:+PrintFlagsFinal | grep "size_t MaxHeapSize"
    docker run -it --rm -m=1024M eclipse-temurin:24 java -XX:+PrintFlagsFinal | grep "size_t MaxHeapSize"
    echo 'new byte[100_000_000]' | docker run -i --rm -m=1024M eclipse-temurin:24 jshell -q
    echo 'new byte[500_000_000]' | docker run -i --rm -m=1024M eclipse-temurin:24 jshell -q

    ./gradlew :microservices:product-service:build
    ./gradlew :microservices:product-composite-service:build
    ./gradlew :microservices:recommendation-service:build
    ./gradlew :microservices:review-service:build

    cd microservices/product-service
    docker build -t product-service .
    docker images | grep product-service
    docker run --rm -p8080:8080 -e "SPRING_PROFILES_ACTIVE=docker" product-service

    curl localhost:8080/product/3
    docker ps
    docker run -d -p8080:8080 -e "SPRING_PROFILES_ACTIVE=docker" --name my-prd-srv product-service
    docker logs my-prd-srv -f
    docker rm -f my-prd-srv

    docker compose build
    docker images | grep chapter04
    docker compose up -d
    docker compose logs -f
    docker compose down

    ./gradlew clean build && docker compose build && ./test-em-all.bash start stop







