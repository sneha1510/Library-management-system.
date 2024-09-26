# Library-management-system.

Kata
Kata: Library Management System
Objective
Create a simple library management system that allows users to perform basic operations
such as adding books, borrowing books, returning books, and viewing available books.
----------------------------------------------------------------------------
Code is written using Java and Junit Testing framework

To setup and configure- We have to add following artifacts(present at dependency only) at pom.xml
       **junit-jupiter-engine**
       **junit-jupiter-api**
       
To test- We have to use following artifacts(present at dependency only) at pom.xml
     **maven-surefire-plugin**
     **maven-surefire-report-plugin**
To test use **@test** annonation in java code
    
To generate test reports: Maven surefire report plugin is added as a dependency at pom.xml

Command used to generate test report
Test reports are generated after using commaond "mvn clean test site" and available at target/surefile-reports


