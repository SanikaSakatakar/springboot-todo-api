# 📝Spring Boot To-Do API

A simple and scalable RESTful To-Do Management API built using **Spring Boot**, **Spring Data JPA**, **Hibernate**, and **MySQL**. This project demonstrates CRUD operations, REST API development, layered architecture, and database integration.

---

## 🚀Features

- ✅ Create a new task
- 📋 Get all tasks
- 🔍 Get task by ID
- ✏️ Update existing task
- ❌ Delete task
- ✔️ Mark task as Completed/Pending
- 🗄️ MySQL Database Integration
- 🌐 RESTful APIs
- 📦 Layered Architecture (Controller → Service → Repository)
- 🔧 Exception Handling
- 📄 JSON Request & Response

---

## 🛠️ Tech Stack of project

- Java 21
- Spring Boot 3.x
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- REST API
- Postman
- IntelliJ IDEA

---

## 📂Project Structure

```
src
│
├── controller
│     └── TodoController.java
│
├── service
│     ├── TodoService.java
│     └── TodoServiceImpl.java
│
├── repository
│     └── TodoRepository.java
│
├── entity
│     └── Todo.java
│
├── exception
│
└── resources
      └── application.properties
```

---

## 🗃️ Database Configuration

Update your `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tododb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## ▶️ Run the Project

### Clone Repository

```bash
git clone https://github.com/yourusername/springboot-todo-api.git
```

### Navigate

```bash
cd springboot-todo-api
```

### Run

```bash
mvn spring-boot:run
```

Application starts at

```
http://localhost:8080
```

---

# 📌 REST API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | /api/todos | Get All Tasks |
| GET | /api/todos/{id} | Get Task By ID |
| POST | /api/todos | Create Task |
| PUT | /api/todos/{id} | Update Task |
| DELETE | /api/todos/{id} | Delete Task |

---

## 📥 Sample Request

### Create Task

```http
POST /api/todos
```

```json
{
    "title": "Complete Spring Boot Project",
    "description": "Finish REST API",
    "completed": false
}
```

---

## 📤 Sample Response

```json
{
    "id": 1,
    "title": "Complete Spring Boot Project",
    "description": "Finish REST API",
    "completed": false
}
```

---

## 🧪 Testing

Use:

- Postman
- Thunder Client
- Insomnia

---

## 📚 Concepts Covered

- Spring Boot
- REST API
- CRUD Operations
- Dependency Injection
- Spring Data JPA
- Hibernate ORM
- MySQL Integration
- Exception Handling
- MVC Architecture
- JSON Processing

---

## 🎯 Future Enhancements

- JWT Authentication
- Spring Security
- Swagger/OpenAPI Documentation
- Docker Support
- Pagination & Sorting
- Search API
- Validation
- Role-Based Access

---

## 👩‍💻 Author

**Sanika Sakatakar**

B.Tech Artificial Intelligence & Machine Learning

### Skills

- Java
- Spring Boot
- REST API
- MySQL
- Hibernate
- HTML
- CSS
- JavaScript
- Git & GitHub

---

## ⭐ If you like this project

Give it a ⭐ on GitHub.
