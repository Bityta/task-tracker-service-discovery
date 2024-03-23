docker-compose -f docker-compose-ide.yml build
docker-compose -f docker-compose-ide.yml up
http://localhost:8761/

# Task Tracker Service Discovery

The Microservice Discovery Server, powered by Eureka, serves as the central hub for managing and coordinating all
microservices within the application ecosystem. It facilitates service registration, discovery, and monitoring, enabling
seamless communication and interaction among microservices.

## Features

- Service Registration and Discovery: Microservices register themselves with the Eureka server upon startup, allowing
  other services to discover and communicate with them
- Dynamic Service Routing: Eureka provides dynamic routing capabilities, enabling client-side load balancing and
  failover for service instances
- Dashboard and Monitoring: Eureka offers a user-friendly dashboard for monitoring the health and status of registered
  services. It provides real-time insights into service availability and performance
- Self-Healing Architecture: Eureka employs a self-healing architecture where it automatically removes instances of
  services that become unresponsive or fail, ensuring high availability and reliability
- Integration with Docker: The Microservice Discovery Server is Docker-ready, seamlessly integrating with Docker
  containers. It creates and manages the database and RabbitMQ instances within Docker, simplifying deployment and
  scalability

## Getting Started

1. Clone the repository: `git clone <repository-url>`
2. Navigate to the project directory: `cd task-tracker-service-discovery`
3. Configure your desired profile by uncommenting the corresponding section in the application.yml file.
4. Build the Docker image: `docker-compose build`
5. Run the Docker container: `docker-compose up`

This will build the Docker image for the application and start the container.

Once the container is up and running, the application will be accessible at `http://localhost:8761`.
There you can monitor the operation of microservices.

### Settings

Go to docker-compose.yml. And set the parameters for PostgreSQL and RabbitMQ.

```yml
services:
  postgres:
    environment:
    POSTGRES_USER: your-user
    POSTGRES_PASSWORD: your-password

  rabbitmq:
    environment:
      RABBITMQ_PASSWORD: your-user
      RABBITMQ_USERNAME: your-password

```

Replace your-user and your-password with any user data to create a new Postgresql database and RabbitMQ profile

## Dependencies

- Spring Boot
- Spring Cloud Eureka Server

## Contributing

Contributions are welcome! Feel free to submit pull requests or open issues for any improvements or bug fixes.