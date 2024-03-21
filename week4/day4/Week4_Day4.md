### Parameterization: 
  - No hardcoding of data 

 - static
 - dynamic

Steps to implement Static Parameterization:
1. Identify the data that are common data across all testcases
   ex: url,username,password
   <parameter name="url"
		value="http://leaftaps.com/opentaps/control/main"></parameter>
2. Add parameter tag for each one of the data in the testng.xml file
3. Map the parameters in the java class using @Parameters
   Note: The name should exactly match the names in the xml
   @Parameters({"url","username","password"})
4. Use that parameters inside the mathod using arguments
   Note: Sequence matters but the name of the argument doesnot matter
   public void preCondition(String url,String uName,String pWord)
5. Finally, replace it with arguments
       driver.get(url);

Note: You should always run from the xml file when you use parameters


### Dynamic Parameterization
Steps to implement Dynamic Parameterization:
1. Identify the datas that are specific to the particular testcase
   ex: CreateLead - compnayname, firstname, lastname, phonenumber
       EditLead - phonenumber,companyname
2. Create a method sendData() inside the CreateLead class 
3. Annotate that method with @DataProvider
4. Inside sendData() create 2-Dimensional array with number of rows and columns
     - Add all the sets of data into the array and make sure the index starts from 0
5. Return the data back to the calling method
6. Receive this data in the test method
    - use dataprovider attibute
    - use that arguments inside the method.
7. Finally, replace the hardcoded values