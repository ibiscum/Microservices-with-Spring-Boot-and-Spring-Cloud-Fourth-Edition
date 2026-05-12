# Microservices with Spring Boot and Spring Cloud - Chapter 5

    docker run -t --rm -v ${PWD}:/app zavoloklom/dclint ./docker-compose.yml

	./mvnw clean install -U
	./mvnw spring-boot:run
	./mvnw spring-boot:build-image

	curl "http://localhost:8080/product-composite/123" -s | jq .
    curl "http://localhost:8080/product-composite/123" -H "accept: application/json"

