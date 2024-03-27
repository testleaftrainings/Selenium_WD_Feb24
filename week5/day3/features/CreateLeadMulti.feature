Feature: Laptaps login feature

Scenario Outline: Login functionality with positive credentials

#Test steps for login functionality
Given Launch the browser
And Load the url
And Enter the username
And Enter the password
When Click on the login button
Then Verify login is successful
When Click on the crmsfa
And Click on the Leads tab
And Click on the Create Lead link
Given Enter the company name as <cname>
And Enter the first name as <fname>
And Enter the last name as <lname>
And Enter the phno <phno>
When Click on the submit button

Examples:
|phno|fname|lname|cname|
|99|Gokul|Sekar|Testleaf|
|98|Babu|M|Qeagle|
|97|Hari|R|Testleaf|
