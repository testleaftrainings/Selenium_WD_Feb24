Steps to Implement ThreadLocal for Report
-----------------------------------------
1. Create ThreadLocal for ExtentTest and String , use name as parentTest and testName
2. In the setReport()/@BeforeClass after assigning information to the report , assign the test value into the parentTest ThreadLocal {Ex: parentTest.set(test)}
3. In Next line assign testCaseName value to testName ThreadLocal
4. Command/remove the node steps 
5. Create a getter method for parentTest and testName as getTest() and getTestName()
6. Create a ThreadLocal for ExtentTest use name as node
7. Create setter and getter for node and inside setter create a node by using parentTest and testName
8. In getter method of node return the node value.
9. In reportStep() , use getNode() for pass and fail report log
10. Call the setNode() in preCondition as first line/ before calling the driver instance.


