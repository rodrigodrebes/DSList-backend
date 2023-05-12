# DSList Spring Project

The DSList Spring Project is an application built using Spring Boot framework and H2 database. The main purpose of this project is to create, manipulate and manage a list of video games.

## Overview

The project employs the following technologies:

- **Spring Boot**: A popular Java-based framework for building stand-alone, production-grade Spring based applications.
- **Spring Data JPA**: Used for repository layer implementation that significantly simplifies the code.
- **H2 Database**: An open-source in-memory database system which is fast and lightweight. It's used here for testing and development purposes.
- **Java Persistence API (JPA)**: A Java application programming interface specification that describes the management of relational data in applications.

## Key Components

### Repositories

The `GameRepository` and `GameListRepository` interfaces serve as the data access layer for interacting with the database. They extend `JpaRepository` which provides basic CRUD operations on the `Game` and `GameList` entities respectively.

### Data Transfer Objects (DTO)

Data Transfer Objects (DTO) are plain old Java objects that are used to encapsulate data and transport it between processes. They improve performance by reducing the number of method calls when transferring data over a network.

`GameDTO` and `GameListDTO` are used to send data of `Game` and `GameList` respectively between client and server. They ensure that data sent is not tied to any specific database schema and helps in maintaining the separation of concerns.

### Application

`DSListApplication` is the main class that uses Spring Boot's `SpringApplication.run()` method to launch the application.

## Getting Started

To run the application:

1. Clone the repository.
2. Navigate to the project directory.
3. Run the application using your IDE or from the command line with `mvn spring-boot:run`.

Please note that you need to have Java and Maven installed on your machine to run the application.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](https://choosealicense.com/licenses/mit/)
