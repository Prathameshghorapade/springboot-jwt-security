# 🔐 Spring Boot JWT Authentication API

A modern and secure **REST API** built with **Spring Boot 3**, **Spring Security**, and **JWT (JSON Web Tokens)** for handling authentication and authorization.  
This project demonstrates secure login, token generation, and role-protected endpoints using an in-memory `Employee` service.

---

## 🧰 Tech Stack

| Tool        | Description                      |
|-------------|----------------------------------|
| ⚙️ Spring Boot | Backend framework                |
| 🛡️ Spring Security | Authentication & authorization |
| 🔑 JWT (jjwt) | Token generation and validation |
| ☕ Java 21   | Language                         |
| 📦 Maven    | Build tool                       |
| 🧾 Lombok   | (Optional) Boilerplate removal   |
| 🧵 Jakarta Servlet | Web filter & HTTP request handling |

---

## ✨ Key Features

✅ Token-based authentication (JWT)  
✅ Custom `/auth/login` endpoint  
✅ Stateless session management  
✅ Protected REST APIs using `Bearer <token>`  
✅ Role-based access (extendable)  
✅ Custom `Employee` service for demo  
✅ Clean code structure: Controller, Service, Security, Model  

---

## 🚀 Getting Started

### ✅ Prerequisites

- Java 17 or higher (**Java 21 recommended**)
- Maven installed
- Any IDE (IntelliJ / VS Code / Eclipse)

### 🔄 Clone the Repository

```bash
git clone https://github.com/Prathameshghorapade/springboot-jwt-security.git
cd springboot-jwt-security


### Clone the Project

```bash
git clone https://github.com/your-username/springboot-jwt-auth-api.git
cd springboot-jwt-auth-api



POST /login
Content-Type: application/json

{
  "name": "pratham",
  "password": "aa"
}


{
  "jwtToken": "eyJhbGciOiJIUzI1NiIsInR5cCI6Ikp...",
  "name": "pratham"
}


GET /employees
Authorization: Bearer <your_token_here>







