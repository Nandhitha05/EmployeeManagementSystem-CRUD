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

📁 Project Structure
employee/
├── Employee.java          # Model class
├── EmployeeDao.java       # Interface for operations
├── EmployeeImpl.java      # Implements DAO, handles JDBC logic
├── DBConnection.java      # Database connection logic
└── Main.java              # Entry point with menu-driven UI

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

▶️ How to Run
->Import the project in IntelliJ
->Update your MySQL credentials in DBConnection.java
->Run Main.java
->Follow the CLI prompts

