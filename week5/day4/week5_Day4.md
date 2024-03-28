pom.xml --> Project Object Model.xml
POM --> Page Object Model is design pattern


Steps to bulid PageObjectModel
------------------------------
1. Create a new project and add the required dependencies
2. Create a 4 packages which are pages, base, testcases and utils.
3. Create a class a ProjectSpecificMethod under base package and declare preCondition and postCondition methods
4. Create classes for all the webpages.
5. Create methods for each WebElement in the WebPages.
6. Inherit ProjectSpecificMethod in all the Pages class.
7. Write a test script for each methods based on the WebElement
8. Add a return type for all methods based on the WebElement action.
9. Create a testcase under the testcases package 
10. Inherit ProjectSpecificMrthod in all the testcase class.
11. Create a Object for LoginPage and design the flow of execution.
12. Change driver as static in ProjectSpecificMethod. To avoid nullPointerException


Steps to execute testcase parallel by using POM
-----------------------------------------------
1. Remove static for driver in ProjectSpecificMethod
2. Pass the driver instance through the LoginPage Constructor.
3. Create a Constructor for LoginPage with input arguments as driver 
4. Assign local driver variable value into the gobal driver variable. (eg: this.driver = driver)
5. Pass the driver instance for all the constructor in the method return type and as well as create constructor and repeat step 4.