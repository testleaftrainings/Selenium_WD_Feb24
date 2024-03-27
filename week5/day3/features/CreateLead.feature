Feature: Laptaps login feature

@smoke
Scenario: Login functionality with positive credentials

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
Given Enter the company name as Testleaf
And Enter the first name as Gokul
And Enter the last name as Sekar
And Enter the phno 99
When Click on the submit button