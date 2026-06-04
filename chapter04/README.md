# Microservices with Spring Boot and Spring Cloud - Chapter 4

    docker run -t --rm -v ${PWD}:/app zavoloklom/dclint ./docker-compose.yml
    docker run --rm -i hadolint/hadolint < Dockerfile

    echo 'Runtime.getRuntime().availableProcessors()' | docker run --rm -i eclipse-temurin:25-jre-ubi10-minimal jshell -q
    echo 'Runtime.getRuntime().availableProcessors()' | docker run --rm -i --cpus=3 eclipse-temurin:24 jshell -q
    docker run -it --rm eclipse-temurin:24 java -XX:+PrintFlagsFinal | grep "size_t MaxHeapSize"
    docker run -it --rm -m=1024M eclipse-temurin:24 java -XX:+PrintFlagsFinal | grep "size_t MaxHeapSize"
    echo 'new byte[100_000_000]' | docker run -i --rm -m=1024M eclipse-temurin:24 jshell -q
    echo 'new byte[500_000_000]' | docker run -i --rm -m=1024M eclipse-temurin:24 jshell -q

    docker run --rm -i hadolint/hadolint < Dockerfile

	mvn clean package jib:dockerBuild -Djib.container.mainClass=se.magnus.microservices.core.product.ProductServiceApplication -Djib.from.platforms=linux/arm64 -DskipTests

	mvn clean package jib:dockerBuild -Djib.container.mainClass=se.magnus.microservices.composite.product.ProductCompositeServiceApplication -Djib.from.platforms=linux/arm64 -DskipTests

	mvn clean package jib:dockerBuild -Djib.container.mainClass=se.magnus.microservices.core.recommendation.RecommendationServiceApplication -Djib.from.platforms=linux/arm64 -DskipTests

	mvn clean package jib:dockerBuild -Djib.container.mainClass=se.magnus.microservices.core.review.ReviewServiceApplication -Djib.from.platforms=linux/arm64 -DskipTests

    docker run --rm -p8080:8080 -e "SPRING_PROFILES_ACTIVE=docker" --name ch04-prd-srv ch04-product-service:v1.0.0
	docker run --rm -p8083:8080 -e "SPRING_PROFILES_ACTIVE=docker" --name ch04-prd-cmp-srv ch04-product-composite-service:v1.0.0
	docker run -d -p8081:8080 -e "SPRING_PROFILES_ACTIVE=docker" --name ch04-rec-srv ch04-recomendation-service:v1.0.0
	docker run -d -p8082:8080 -e "SPRING_PROFILES_ACTIVE=docker" --name ch04-rev-srv ch04-review-service:v1.0.0

    curl localhost:8080/product/3
    docker ps

    docker logs my-prd-srv -f
    docker rm -f my-prd-srv

    docker compose build
    docker images | grep chapter04
    docker compose up -d
    docker compose logs -f
    docker compose down

    ./gradlew clean build && docker compose build && ./test-em-all.bash start stop
