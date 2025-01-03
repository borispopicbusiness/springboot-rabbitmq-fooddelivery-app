# Food delivery web app

A food delivery app developed with Spring Boot, Docker, and RabbitMQ. This is a demonstration of the tech stack, how
these technologies work together

## About docker-compose.yml

Two docker containers are defined in the file. The first one is rabbitmq, and the second one is postgres. If you open
the file you will find the credentials for the services run in the containers. The most important ones are:

    - RABBITMQ_DEFAULT_USER: guest
    - RABBITMQ_DEFAULT_PASS: guest

and 

    - POSTGRES_USER: delivery_admin
    - POSTGRES_PASSWORD: admin

The postgressql database name is defined in the line:

    - POSTGRES_DB: food_delivery

You can start them executing:

    docker compose up

or

    docker compose up -d

If you want to test them you may use

    docker exec -it postgres /bin/bash
    docker exec -it postgres psql -U postgres_admin -d food_delivery

After executing the second command you may execute

    \l

this will list you the databases present in the postgres instance running in the container.

## Running the application

The application can be run with the following command:

    mvn spring-boot:run

## Useful curl-s

For Menu endpoints:
    
    curl -X GET "http://localhost:8081/api/v1/menu/get/all"