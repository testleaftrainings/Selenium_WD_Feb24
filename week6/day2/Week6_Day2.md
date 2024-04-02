Encapsulation
-------------
 - Encapsulation is a process of binding data together which is variables and methods.
 - used to hide the important data.
 - by using getter and setter we can able access this.



ThreadLocal Implementation for driver
-------------------------------------
1. Remove the constructor in all pages and remove driver instance from the constructor
2. Remove driver instance from the constructor in all testcases.
3. Declare ThreadLocal for driver in ProjectSpecificMethod(base class)
4. Declare setter and getter for driver.
5. Inside the setDriver method set/assign value for ThreadLocal driver.
6. return the ThreadLocal driver instance in getDriver method. 
7. Remove globally declared driver.
8. In preCondition method instead of driver = new ChromeDriver() replace with setDriver method.
9. Instead of driver use getDriver method for the entire project


bs --> startReport
bt --> setData  --> pass dynamic input of excel file name and report details
bc --> setReport
bm --> preCondition
t --> testcase
am --> postCondition
ac
at
as --> endReport


Steps to Integrate Extent Report with POM
-----------------------------------------
 1. Create a method as startReport() and declare a static code for reports. 
 2. Make ExtentReports as gobal
 3. Create a method as setReport and declare report creatation steps for the testcase
 4. Declare global variable for the report input which are testcaseName, testcaseDescription, authorName, categoryName
 5. In all testcase class create a method as setData and assign values for testcaseName, testcaseDescription, authorName, categoryName.
 6. Use @BeforeSuite Annotation for startReport() and @BeforeTest annotation for setData() in all testcase and @BeforeClass annotation for setReport() in Base class.
 7. Make ExtentTest as static global and remove local declaration.
 8. Create a method as takeSnap() in base class and inside the method generate a random number by Math.random() and write a logic to take a snap and return the random number.
 9. Create a method as reportStep(String status, String desc) in base class and inside the write a logic for test report.
 10. Create a method as endReport() and @AfterSuite annotation 


