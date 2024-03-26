Feature: Laptaps login feature
Background:
Given Launch the browser
And Load the url
    
Scenario: Login functionality with positive credentials

#Given Launch the browser
#And Load the url
Given Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the login button
Then Verify login is successful

Scenario: Login functionality with both username and password as invalid

#Given Launch the browser
#And Load the url
And Enter the username as 'gokul.sekar@testleaf.com'
And Enter the password as 'Leaf@1234'
When Click on the login button
But Verify login is successful 

Scenario: Login functionality with invalid username and valid password

#Given Launch the browser
#And Load the url
And Enter the username as 'demomanager'
And Enter the password as 'crmsfa'
When Click on the login button
Then Verify login is successful