**Java Employee Management System (CRUD)**
This is a simple Java-based Employee Management System built using JDBC (Java Database Connectivity). It performs basic CRUD operations (Create, Read, Update, Delete) on an employee table in a MySQL database.

🚀 Features:
✅ Add new employee records
🔍 View all employee details
🔎 Search employee by ID
✏️ Update employee name by ID
❌ Delete employee by ID
💾 Uses MySQL for data storage
📦 Clean object-oriented structure (Employee, EmployeeImpl, EmployeeDao)

🛠 Technologies Used:
1. Java (Version- JDK 21)
2. JDBC
3. MySQL
4. IntelliJ IDEA
5. Git & GitHub


🗃️ Database Setup
Database: EmployeeDB
Table: employee

->CREATE DATABASE EmployeeDB;
->USE EmployeeDB;
->CREATE TABLE employee (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    salary DOUBLE,
    age INT
);

How to Run?
1. Import the project in IntelliJ
2. Update your MySQL credentials in DBConnection.java
3. Run Main.java
4. Follow the CLI prompts

