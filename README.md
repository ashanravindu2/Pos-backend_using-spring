<a href="https://git.io/typing-svg"><img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&weight=600&size=50&pause=1000&center=true&vCenter=true&color=green&width=835&height=70&lines=🛒+POS+System+REST+API" alt="pos" /></a>

# POS System Backend
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![JavaEE](https://img.shields.io/badge/JavaEE-6DB33F?style=for-the-badge&logo=java&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)
![Apache Tomcat](https://img.shields.io/badge/Apache%20Tomcat-F8DC75?style=for-the-badge&logo=apache-tomcat&logoColor=black)


## 📜 Project Description
This project is a **REST API** for a **Point of Sale (POS) System**, built with **Spring Boot** and **Spring Data JPA**. It supports CRUD operations for **Customers**, **Items**, **Orders**, and **Order Details**, designed to manage the core functionalities of a POS system. The back-end uses **MySQL** for database management and follows a clean, layered architecture.

### 🗝 Key Features:
- Manage **Customer** data (add, view, update, delete)
- Handle **Item** inventory
- Process **Orders** and associated **Order Details**
- Well-documented REST API using **Swagger** (OpenAPI)
- Full **CRUD** support for all resources
- Integrated **Logging** for better monitoring and debugging

---

## 🛠️ Tech Stack
- **Java 17** (or higher)
- **Spring Boot**
  - Spring Web MVC (for building REST APIs)
  - Spring Data JPA (for database interaction)
  - Hibernate (as JPA implementation)
- **MySQL** (database)
- **AJAX / Fetch API** (for front-end communication)
- **Lombok** (optional, for reducing boilerplate code)
- **Swagger UI** (for API documentation)
  
---

## 🚀 Getting Started

### 📋 Prerequisites:
Before running the project, ensure you have the following installed:
- **Java 17** (or higher)
- **MySQL** (running instance)
- **Maven**

### 🏃‍♂️ How to Run the Project

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/ashanravindu2/Pos-backend_using-spring.git
   cd pos-system-backend

   ## 📚 Available API Endpoints

### 🔗 Customer API
| Method   | Endpoint                    | Description                    |
|----------|-----------------------------|--------------------------------|
| `GET`    | `/api/v1/customer`             | Get all customers               |
| `POST`   | `/api/v1/customer`             | Create a new customer           |
| `GET`    | `/api/v1/customer/{id}`        | Get customer by ID              |
| `PUT`    | `/api/v1/customer/{id}`        | Update customer by ID           |
| `DELETE` | `/api/v1/customer/{id}`        | Delete customer by ID           |

### 🛒 Item API
| Method   | Endpoint                    | Description                    |
|----------|-----------------------------|--------------------------------|
| `GET`    | `/api/v1/item`                 | Get all items                   |
| `POST`   | `/api/v1/item`                 | Create a new item               |
| `GET`    | `/api/v1/item/{id}`            | Get item by ID                  |
| `PUT`    | `/api/v1/item/{id}`            | Update item by ID               |
| `DELETE` | `/api/v1/item/{id}`            | Delete item by ID               |

### 🛍️ Order API
| Method   | Endpoint                    | Description                    |
|----------|-----------------------------|--------------------------------|
| `GET`    | `/api/orders`                | Get all orders                  |
| `POST`   | `/api/orders`                | Create a new order              |
| `GET`    | `/api/orders/{id}`           | Get order by ID                 |

### 🧾 Order Details API
| Method   | Endpoint                    | Description                    |
|----------|-----------------------------|--------------------------------|
| `GET`    | `/api/v1/orders`         | Get all order details           |
| `POST`   | `/api/v1/orders`         | Create new order details        |
| `GET`    | `/api/v1/orders/{id}`    | Get order details by ID         |


## API EndPoint Documentation

### https://documenter.getpostman.com/view/35385633/2sAXxV5q48



<div align="center">

#### © 2024 All Right Reserved, Designed By [Ashan Ravindu Lakshitha] (https://github.com/ashanravindu2)

</div>
