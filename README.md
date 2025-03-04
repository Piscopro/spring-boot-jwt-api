# JWT RestAPI

Name: Trần Vỹ Anh
StudentID: 22024508

## Overview
This project is a REST API implementation using Spring Boot and Spring Security with JWT (JSON Web Token) authentication. It demonstrates secure authentication and authorization mechanisms, allowing different levels of access control for users and administrators.

## Key Features
- JWT-based authentication and authorization
- Role-based access control (User and Admin roles)
- Secure endpoints with Spring Security
- RESTful API endpoints:
  - Public access endpoints
  - User-restricted endpoints
  - Admin-restricted endpoints
- User management:
  - User registration (signup)
  - User authentication (signin)
  - Token-based session management
- Database persistence with JPA/Hibernate
- Password encryption with BCrypt
- Cross-Origin Resource Sharing (CORS) support
- Comprehensive API testing examples

## Installation Guide
1. Build the project using Maven:
    ```sh
    mvn clean install
    ```

2. Run the application:
    ```sh
    mvn spring-boot:run
    ```

## Test API
### Register new user
Admin
![Database](spring-boot-jwt-api/src/main/resources/img/admin_signup.png)
User
![Database](spring-boot-jwt-api/src/main/resources/img/user_signup.png)

### Admin 
Sign in and get JWT token
![Database](spring-boot-jwt-api/src/main/resources/img/admin_signin_getjwt.png)
GET
![Database](spring-boot-jwt-api/src/main/resources/img/test_admin_get.png)
POST
![Database](spring-boot-jwt-api/src/main/resources/img/test_admin_post.png)
PUT
![Database](spring-boot-jwt-api/src/main/resources/img/test_admin_put.png)
DELETE
![Database](spring-boot-jwt-api/src/main/resources/img/test_admin_del.png)

### User
Sign in
![Database](spring-boot-jwt-api/src/main/resources/img/user_signin.png)
GET
![Database](spring-boot-jwt-api/src/main/resources/img/test_user_get.png)
POST
![Database](spring-boot-jwt-api/src/main/resources/img/test_user_post.png)
Access declined when GET from admin
![Database](spring-boot-jwt-api/src/main/resources/img/test_user_get_admin_decline.png)

### Public
GET
![Database](spring-boot-jwt-api/src/main/resources/img/test_public_get.png)
