# decathlonCucumber
This is the Selenium, Cucumber, TestNg with Java Framework for automating the decathlon buy item flow.

## How to build and execute the solution

### Pre-requisites
1. Java 8 or higher
2. Maven
3. TestNg
4. Cucumber
5. Selenium 

### Build

1. Clone the repository:
   git clone https://github.com/<username>/<repository-name>.git

2. Navigate to the cloned repository:
   cd <repository-name>

3. Build the project:
   mvn clean install

### Execute

1. Execute the tests:
   mvn test

### Test Executions
There are three options to execute the tests :- 
1. To execute it using testng.xml file
2. To execute it using CucumberTestRunner file
3. To execute it using maven clean test command from command line

### Test Data
Test data is stored in form of examples within feature files and can be manipulated only from there. 

### Reports & Screenshots
- Extent report gets generated after every execution and is saved under Reports folder.
- Login pop screenshot gets captured after proceed to checkout button gets clicked and is saved under Reports folder. 
