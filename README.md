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



Library-management-system
│
├── pom.xml
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── org
│   │   │       └── test_package
│   │   │           ├── Library.java        # Main class for library management
│   │   │           └── Book.java           # Class representing a book
│   │   │
│   │   └── resources
│   │       └── (any resource files, e.g., configuration files)
│   │
│   └── test
│       ├── java
│       │   └── org
│       │       └── test_package
│       │           └── LibraryTest.java    # Test class for Library
│       │
│       └── resources
│           └── (any resource files for tests, if needed)
│
└── target
    ├── classes                      # Compiled classes
    ├── test-classes                 # Compiled test classes
    ├── surefire-reports             # Test reports 
    └── site                         # Generated site documentation including reports


