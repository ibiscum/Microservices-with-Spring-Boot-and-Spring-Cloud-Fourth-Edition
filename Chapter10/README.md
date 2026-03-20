# Microservices with Spring Boot and Spring Cloud - Chapter 10

    docker run -t --rm -v ${PWD}:/app zavoloklom/dclint ./docker-compose.yml
    docker run -t --rm -v ${PWD}:/app zavoloklom/dclint ./docker-compose-kafka.yml
    docker run -t --rm -v ${PWD}:/app zavoloklom/dclint ./docker-compose-partitions.yml

    ./gradlew :microservices:recommendation-service:test
    ./gradlew build -x test
