# Spring Boot Orders API

## Overview

This project is a RESTful API developed as part of a university module. It uses Java and the Spring Boot framework to manage order records and perform basic CRUD (Create, Read, Update and Delete) operations.

The application provides endpoints for retrieving, creating, updating, deleting and searching orders. It uses Spring Data JPA to interact with the database and returns data in JSON format.

The project also includes a custom HTML interface for sending HTTP requests and viewing API responses.

<img src="./screenshots/Web%20interface.png" width="800">

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- REST API
- HTTP methods (GET, POST, PUT and DELETE)
- JSON
- HTML
- CSS
- JavaScript
- Relational database integration through JPA

## Features

### Order Management

The API supports the following operations:

| HTTP Method | Endpoint | Description |
|---|---|---|
| GET | `/orders` | Retrieve all orders |
| GET | `/orders/{id}` | Retrieve an order by its ID |
| GET | `/orders/giValue/{giValue}` | Find orders using their GI value |
| POST | `/orders` | Create a new order |
| PUT | `/orders/{id}` | Update an existing order |
| DELETE | `/orders/{id}` | Delete an order |

### Order Information

Each order contains the following fields:

- `id` – Automatically generated order ID.
- `item` – Name or description of the item.
- `date` – Order date.
- `cost` – Cost of the order.
- `jdCode` – JD code associated with the order.
- `giValue` – GI value used for searching orders.

### Error Handling

The application includes a global exception handler using `@RestControllerAdvice`.

If an order cannot be found, the API returns an HTTP 404 (Not Found) response with a JSON message explaining the error.

## HTML API Testing Interface

The project includes a custom HTML interface for interacting with the REST API.

The interface allows users to:

- Select an HTTP method.
- Enter a request URL.
- Write and format JSON request bodies.
- Load an example order.
- Send requests to the API.
- View the returned JSON response and HTTP status.
- See connection errors if the server cannot be reached.

The interface is designed to make testing the API easier without needing a separate API testing application.

## Running the Application

1. Clone or download this repository.
2. Open the project in an IDE such as IntelliJ IDEA or Eclipse.
3. Make sure Java and Maven are installed.
4. Configure the database connection in `application.properties` if required.
5. Run the `RunApplication` class.
6. Once the Spring Boot application has started, open:

   `http://localhost:8080/`

The HTML interface should load, allowing you to interact with the API.

The API endpoints are available under:

`http://localhost:8080/orders`

## Skills Developed

Through this project, I gained experience with:

- Developing RESTful APIs using Spring Boot.
- Creating Java classes and working with object-oriented programming.
- Using Spring Data JPA and repositories.
- Performing CRUD operations.
- Working with HTTP methods and JSON data.
- Handling exceptions and returning appropriate HTTP status codes.
- Connecting a frontend interface to a backend API using JavaScript and Fetch.
- Testing API functionality through HTTP requests.

## Project Background

This application was originally developed as part of a university module. The Spring Boot backend and its associated Java classes were developed for the coursework.

The HTML testing interface included in this repository is a replacement interface created to improve the usability and presentation of the project.
