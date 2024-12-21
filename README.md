# Library-management-system. With Unit Testing

Kata
Kata: Library Management System
Objective
Create a simple library management system that allows users to perform basic operations
such as adding books, borrowing books, returning books, and viewing available books.
----------------------------------------------------------------------------
Code is written using Java and Junit Testing framework 
**(Kindly note: Initially I had used testNg framework but later I removed TestNg and again used JUnit)**

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



 screenshots of the report
 ![Screenshot 2024-09-26 181325](https://github.com/user-attachments/assets/dfcd29d0-b14c-454d-ad49-d3aa59ddddcc)
![Screenshot 2024-09-26 181348](https://github.com/user-attachments/assets/5bd3e776-4a52-4ada-a102-e1015a3d35e7)

