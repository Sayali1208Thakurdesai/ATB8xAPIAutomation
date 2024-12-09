### **Topics :  Rest Assured **
- Adding TestNG
- Builder Pattern Design Pattern
- Rest Assured - **BDD and Non BDD Style**
- Rest Assured Classes
- CRUD Operation
    - GET
    - POST
    - PATCH
    - PUT
- Maven basics more
- Reporting Allure


## Reporting
1. **Allure Report **- FREE Open source - Directly integrate with maven projects.
2. Extent Report - Now days we bad, they have mad all the good features - paid.
3. ReportNG - Default TestNG - Trust me, It is very bad report.


### Rest Assured Test cases
1. BDD Style
2. Non BDD Style - **Non BDD style is scalable, maintainable and used in 99% of Rest Assured Frameworks.**
****

---

## TestNG
- TestNG is a **testing framework** inspired from JUnit and NUnit but introducing some new functionalities that make it more powerful and easier to use.
- Manage your Test cases
    - Group
    - Annotation to tag, - Before Running Testcase, After Testcase
    - Run parallel by TestNG
- Data Provider - Excel sheet, Retry Testcase (Failure)


### Why do we need TestNG?
1. How do write the Test case.
2. Manage TC, How can run 100 Test combined, How can make 100 , 10 - P0.
3. Group TC, Run Parrelly, How can I make Groups.
4. before run TC, after run TC, -??
5. RUN Test case , QA -> 10, Prod - 12
6. Verify your Response , Generate your Report - HTML


Junit -> by default used - Junit has some limitations --- limited to Java programs

```
TestNG - Advance Features in the Junit -> TestNG
```
#### How to Install TestNG and How to Use?
1. Maven Repo
    1. <!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.10.2</version>
    <scope>test</scope>
</dependency>
2. Features TestNG
    1. Annotations - @annotation -> has some meaning 
    2.  use of annotation is to give functions extra functionality.
        1. Function -> labor 2+2 -> 4 - @annoation - extra functionality


**How to TestNG Works?**

1. testng.xml -> contain information about which class -> method we want to run (`public void test_get(){)` .
2. Make sure you add a .
3. TestNG framework -> testng.xml -> temp.java file where ever you have written @Test -> main method -> `public void test_get(){) - copied there`  and executed.
4. Test Suite -> many classes -> 1 class -> many methods
