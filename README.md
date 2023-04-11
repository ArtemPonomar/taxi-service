# Taxi Service
This is a web-application for interacting with database data for demonstrative perpouces.
# technologies used 
IDE - IntelliJ IDEA ultimate 2023.1
language - java 17, 
servlet container - TomCat 9.0.50
DBMS - MySQL v.8.0.32.
vcs - git v2.29.2,
build tool - maven v.3.8.1
# Patterns used
For interacting with databse simple DAO pattern was used. 
To implement dependency injection custom injector class was written wich uses combination of annotations and reflection to initialize dao and service objects.
Web technology is based on HttpServlet implementations with jsp files to store page layouts.
Project also uses Filters to block unauthorised users from accessing pages that require prior authentification. 
# Deployment guide
install required software from paragreph 'technologies used'
-setup the database
  create table structure using file: resources/init_db.sql
  update credentials for connection to the database in class java/taxi/util/ConnectionUtil.java
-edit run configuration
  1.![image](https://user-images.githubusercontent.com/37250267/231195029-04345f48-022a-41d1-ba38-b2d9f3a84014.png)
  2.Add new -> Tomcat local![image](https://user-images.githubusercontent.com/37250267/231195255-ba03a5dc-5437-471d-a1e7-d62f939ca4e6.png)
  3.Configure application server -> select path to installed Tomcat![image](https://user-images.githubusercontent.com/37250267/231195812-02d99e68-59eb-4b31-a346-d3f7689b084f.png)
  4.add 'build artifacts' after buid![image](https://user-images.githubusercontent.com/37250267/231196725-70247218-b837-4f57-a18f-87698d5eed83.png)
  select 'build artifacts' option ![image](https://user-images.githubusercontent.com/37250267/231196945-a70cff14-33ad-4ae3-974c-ee6bd6989812.png)
  5.in tab 'deployment' select deployment of service:war, set application context as '/'![image](https://user-images.githubusercontent.com/37250267/231197370-842804ed-5c20-46fb-8f2b-8016751a14f1.png)
  6.Apply changes
-select java version 11+ in File -> Project -> SDK
-run your project in SDK, send URL queries in your prefered web browser f.e.: localhost:8080/login
# Usage instructions
After deploying the project and getting to 'localhost:8080/login'
now you have access only to login page and creating of a new user called driver.
add new driver in menue option: Drivers -> addDriver
login using credentials from the driver you just created to unlock abbility to interact with other menue options
