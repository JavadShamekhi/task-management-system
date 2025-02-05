# Task Management System

A **Task Management System** built with **Java Spring Boot** and **MySQL**, designed to manage tasks efficiently by categorizing, prioritizing, and tracking their status.

---

## Features
- **CRUD Operations**:
  - Create, Read, Update, Delete tasks and categories.
- **Task Prioritization**:
  - Assign priorities such as `LOW`, `MEDIUM`, or `HIGH`.
- **Status Tracking**:
  - Track task progress (`TO_DO`, `IN_PROGRESS`, `DONE`).
- **Categorization**:
  - Organize tasks under different categories.
- **Spring Security**:
  - Basic authentication for secure API access.

---

## Tech Stack
- **Backend**: Java Spring Boot
- **Database**: MySQL
- **Build Tool**: Maven
- **Security**: Spring Security
- **ORM**: Hibernate (JPA)

---

## Getting Started

### Prerequisites
- **Java JDK 17+**
- **MySQL**
- **Maven**

### Steps to Run the Project
1. **Clone the repository**:
   ```bash
   git clone https://github.com/JavadShamekhi/task-management-system.git
   cd task-management-system

2. **Configure the Database**: Update application.properties with your database credentials:
   ```bash
    spring.datasource.url=jdbc:mysql://localhost:3306/task_management
    spring.datasource.username=your-username
    spring.datasource.password=your-password

    # Turn off the Spring Boot banner
    spring.main.banner-mode=off

    # Reduce logging level. Set logging level to warn
    logging.level.root=warn

    # Show JPA/Hibernate logging messages
    logging.level.org.hibernate.SQL=trace
    logging.level.org.hibernate.orm.jdbc.bind=trace

    # Changing spring security settings
    spring.security.user.name=admin
    spring.security.user.password=12345 

3. **Run the Project**:
mvn spring-boot:Run

4. **Access the API**:
Default URL: http://localhost:8080


## 📌 API Endpoints

### 🔹 Task APIs
| HTTP Method | Endpoint             | Description             |
|------------|----------------------|-------------------------|
| **POST**   | `/api/tasks`         | Create a new task      |
| **GET**    | `/api/tasks`         | Get all tasks         |
| **GET**    | `/api/tasks/{id}`    | Get task by ID        |
| **PUT**    | `/api/tasks/{id}`    | Update an existing task |
| **DELETE** | `/api/tasks/{id}`    | Delete a task         |

---

### 🔹 Category APIs
| HTTP Method | Endpoint               | Description               |
|------------|------------------------|---------------------------|
| **POST**   | `/api/categories`       | Create a new category    |
| **GET**    | `/api/categories`       | Get all categories       |
| **GET**    | `/api/categories/{id}`  | Get category by ID       |
| **PUT**    | `/api/categories/{id}`  | Update an existing category |
| **DELETE** | `/api/categories/{id}`  | Delete a category        |



### License
This project is licensed under the MIT Licens.

### Author
Developed by Javad Shamekhi.



