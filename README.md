# Employee Management System (Servlet-Based)

## 📌 Overview

This is a **Java-based web application** built using **Servlets, JSP, and JDBC** that allows an admin to manage employee records.
The application supports authentication and full CRUD operations (Create, Read, Update, Delete).

---

## 🚀 Features

* 🔐 Admin Signup & Login
* 👨‍💼 View Employee List
* ➕ Add New Employee
* ✏️ Update Employee Details
* ❌ Delete Employee
* ✅ Manage Active/Inactive Status

---

## 🛠️ Tech Stack

* **Frontend:** HTML, CSS, JSP
* **Backend:** Java Servlets
* **Database:** MySQL
* **Connectivity:** JDBC
* **Server:** Apache Tomcat

---

## 📂 Project Flow

1. **Login Page**

   * Existing admin logs in
   * New admin can register via Signup

2. **Authentication**

   * Credentials validated using database

3. **Dashboard (Employee Table)**

   * Displays all employees

4. **Operations**

   * Add Employee
   * Update Employee
   * Delete Employee

---

## 🗄️ Database Structure

### Admin Table

| Column   | Type    |
| -------- | ------- |
| username | VARCHAR |
| password | VARCHAR |

### Employee Table

| Column   | Type     |
| -------- | -------- |
| id       | INT (PK) |
| name     | VARCHAR  |
| age      | INT      |
| salary   | DOUBLE   |
| mobile   | VARCHAR  |
| isActive | BOOLEAN  |

---

## ⚙️ Setup Instructions

1. Clone the repository

   ```bash
   git clone <your-repo-link>
   ```

2. Import project into Eclipse / IntelliJ

3. Configure MySQL database

   * Create database
   * Create required tables

4. Update DB credentials in code

   ```java
   String url = "jdbc:mysql://localhost:3306/your_db";
   String user = "root";
   String password = "your_password";
   ```

5. Run on Apache Tomcat Server

6. Open browser:

   ```text
   http://localhost:8080/YourProjectName
   ```

---

## 📸 Screens (Optional)

* Login Page
* Signup Page
* Employee Dashboard
* Add/Update Form

---

## 🔑 Key Learnings

* Servlet lifecycle and request handling
* MVC architecture basics
* JDBC integration with MySQL
* Form handling (GET vs POST)
* Session management basics

---

## 🚧 Future Enhancements

* Add pagination for employee list
* Implement search & filter
* Add role-based access control
* Improve UI with modern frameworks (React/Angular)
* Use Spring Boot for better scalability

---

## 👨‍💻 Author

**Sathwika Malka**

---

## 📄 License

This project is for learning purposes.
