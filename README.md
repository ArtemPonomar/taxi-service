# Taxi Service 🚕

This is a web application for interacting with a database for demonstrative purposes.

## Technologies Used

- 💻 IDE: IntelliJ IDEA Ultimate 2023.1
- ☕️ Language: Java 17
- 🚀 Servlet Container: Apache Tomcat 9.0.50
- 🗃️ DBMS: MySQL 8.0.32
- 📦 Build Tool: Maven 3.8.1
- 📜 VCS: Git 2.29.2

## Patterns Used

- 📚 DAO Pattern for database interaction
- 🔌 Custom Injector class for Dependency Injection
- 🌐 HttpServlet and JSP for Web Technology
- 🚦 Filters to block unauthorized access

## Deployment Guide

1. Install the required software (listed above).
2. Set up the database by creating the table structure using the file `resources/init_db.sql`. Update credentials for connection to the database in class `java/taxi/util/ConnectionUtil.java`.
3. Edit the run configuration:
   1. Click on the "Add New" button in the top left corner of the Run Configuration window.
   2. Select "Tomcat Local".
   3. Configure the application server by selecting the path to installed Tomcat.
   4. Add "build artifacts" after build and select "war".
   5. In the "Deployment" tab, select deployment of service:war and set application context as `'/'`.
   6. Apply changes.
4. Select Java version 11+ in `File -> Project -> SDK`.
5. Run your project in SDK and send URL queries in your preferred web browser (e.g., `localhost:8080/login`).

## Usage Instructions
After deploying the project and accessing localhost:8080/login, you will have access only to the login page and the ability to create a new user called a driver.

To add a new driver, go to the "Drivers -> Add Driver" menu option.

Log in using the credentials from the driver you just created to unlock the ability to interact with other menu options.
