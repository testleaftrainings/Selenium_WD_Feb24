Steps to create Properties 
--------------------------
1. Create a Properties file under src/main/resources
2. Assign key pair value into the properties file.

Steps to Read Properties file
------------------------------
1. Create Object for FileInputStream class
2. Create object for Properties class
3. use load method from properties class to load the properties file
4. Use getProperty method to get the value based on the key.



Steps to handle multilingual application
----------------------------------------
1. Create a separate properties files for each languages
2. Use same key for all the properties file.
3. Instead of hard cored value replace with getProperty().




Steps to import the existing maven project
------------------------------------------
1. Click file from menu
2. Click import
3. Choose Existing maven project under maven and proceed with next
4. Click on browse and locate your project from local and click select folder
5. Click finish.








Steps to Create a own report(Extent Report)
-------------------------------------------
1. Add a dependency into the pom.xml
   - extent report -> 3.1.5
2. Create a folder as reports under the project
3. Create a file as result.html under reports folder.
4. Create object for ExtentHtmlReporter and pass report file location into the constructor
5. Create object for ExtentReports 
6. Attach the reporter path into the Report
7. Create report for the testcase
8. Assign author, category for the testcase
9. Create pass and fail test for the testcase
10. Close the report.