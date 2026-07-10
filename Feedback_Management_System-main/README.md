# Feedback Management System

A modern **Feedback Management System** built using **Java Spring Boot** that enables users to submit, manage, and analyze feedback efficiently. The application follows a layered architecture and provides RESTful APIs for seamless integration with frontend applications.

---

## Features

- Submit user feedback
- View all feedback
- Update existing feedback
- Delete feedback
- RESTful API architecture
- Exception handling
- Input validation
- Layered architecture (Controller, Service, Repository)
- MySQL database integration
- Spring Data JPA
- Maven project structure

---

## Tech Stack

| Technology | Version |
|------------|----------|
| Java | 17+ |
| Spring Boot | 3.x |
| Spring Data JPA | Latest |
| MySQL | 8.x |
| Maven | Latest |
| Hibernate | ORM |
| REST API | JSON |
| Lombok | Optional |

---

## Project Structure

```
src
 ├── main
 │   ├── java
 │   │    └── com.feedback
 │   │          ├── controller
 │   │          ├── service
 │   │          ├── repository
 │   │          ├── entity
 │   │          ├── dto
 │   │          ├── exception
 │   │          └── FeedbackManagementApplication.java
 │   │
 │   └── resources
 │        ├── application.properties
 │        └── static
 │
 └── test
```

---

## Installation

### Clone the Repository

```bash


cd Feedback_Management_System
```

### Configure Database

Update the `application.properties` file.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/feedback_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## Run the Application

Using Maven

```bash
mvn spring-boot:run
```

Or

```bash
mvn clean install
java -jar target/*.jar
```

Application runs on

```
http://localhost:8080
```

---

## REST API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | /feedback | Submit feedback |
| GET | /feedback | Get all feedback |
| GET | /feedback/{id} | Get feedback by ID |
| PUT | /feedback/{id} | Update feedback |
| DELETE | /feedback/{id} | Delete feedback |

> Replace the endpoints above if your project uses different API paths.

---

## Example JSON

### Request

```json
{
  "name": "John Doe",
  "email": "john@example.com",
  "message": "Excellent application!"
}
```

### Response

```json
{
  "id": 1,
  "name": "John Doe",
  "email": "john@example.com",
  "message": "Excellent application!"
}
```

---

## Future Improvements

- JWT Authentication
- Role-Based Access Control
- Swagger/OpenAPI Documentation
- Email Notifications
- Admin Dashboard
- Pagination & Sorting
- Search & Filtering
- Docker Deployment
- Unit & Integration Testing

---

## Prerequisites

- Java 17 or above
- Maven
- MySQL Server
- IDE (IntelliJ IDEA / Eclipse / VS Code)

---

## Author

**Dhanushkumar Sekar**

GitHub: https://github.com/Dhanushkumarsekar

LinkedIn: https://www.linkedin.com/in/dhanush44/

Portfolio: https://quiet-empanada-f231a3.netlify.app/

---

## License

This project is licensed under the MIT License.

---

⭐ If you found this project useful, consider giving it a star on GitHub.