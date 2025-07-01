**Java Employee Management System (CRUD)**
This is a simple Java-based Employee Management System built using JDBC (Java Database Connectivity). It performs basic CRUD operations (Create, Read, Update, Delete) on an employee table in a MySQL database.

🚀 Features:
1. Add new employee records
2. View all employee details
3. Search employee by ID
4. Update employee name by ID
5. Delete employee by ID
6. Uses MySQL for data storage
7. Clean object-oriented structure (Employee, EmployeeImpl, EmployeeDao)

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

