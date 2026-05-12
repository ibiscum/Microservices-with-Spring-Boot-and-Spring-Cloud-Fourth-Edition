#!/usr/bin/env bash

spring init \
--boot-version=4.0.6 \
--type=maven-project \
--java-version=25 \
--packaging=jar \
--name=product-service \
--package-name=se.magnus.microservices.core.product \
--groupId=se.magnus.microservices.core.product \
--dependencies=actuator,web \
--version=1.0.0-SNAPSHOT \
product-service

spring init \
--boot-version=4.0.6 \
--type=maven-project \
--java-version=25 \
--packaging=jar \
--name=review-service \
--package-name=se.magnus.microservices.core.review \
--groupId=se.magnus.microservices.core.review \
--dependencies=actuator,web \
--version=1.0.0-SNAPSHOT \
review-service

spring init \
--boot-version=4.0.6 \
--type=maven-project \
--java-version=25 \
--packaging=jar \
--name=recommendation-service \
--package-name=se.magnus.microservices.core.recommendation \
--groupId=se.magnus.microservices.core.recommendation \
--dependencies=actuator,web \
--version=1.0.0-SNAPSHOT \
recommendation-service

spring init \
--boot-version=4.0.6 \
--type=maven-project \
--java-version=25 \
--packaging=jar \
--name=product-composite-service \
--package-name=se.magnus.microservices.composite.product \
--groupId=se.magnus.microservices.composite.product \
--dependencies=actuator,web \
--version=1.0.0-SNAPSHOT \
product-composite-service

cd ..
