Feature: Edit new user

Background: Admin is on dashboard page after Login and clicks User on the navigation bar
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should see a heading with text "Manage user" on the page

 Scenario: Validate login with valid credentials
    Given Admin is in Home Page
    When Admin enter valid credentials and clicks login button 
    Then Admin should land on dashboard page
    
    Scenario: Validate landing in User page
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should see the "Manage User" in the URL

#26
Scenario: Validate row level edit icon
Given Admin is on Manage User Page	
When Admin clicks on the edit icon 	
Then A new pop up with User details appears

#27
Scenario: Check if the fields are updated with valid data
Given Admin is on editUser details pop up	
When Update the fields with valid data and click submit	
Then Admin gets message "User updated Successfully " and see the updated values in data table

#28
Scenario: Check if the fields are updated with invalid values
Given Admin is on editUser details pop up	
When Update the fields with invalid values and click submit	
Then Admin should get Error message 

#29
Scenario: Check if the mandatory fields are updated with valid data
Given Admin is on editUser details pop up	
When Update the mandatory fields with valid values and click submit	
Then Admin gets message "User updated Successfully " and see the updated values in data table

#30
Scenario: Check if the optional fields are updated with valid data
Given Admin is on editUser details pop up	
When Update the optional fields with valid values and click submit	
Then Admin gets message "User updated Successfully " and see the updated values in data table

#31
Scenario: Validate invalid values in the text fields
Given Admin is on editUser details pop up	
When Admin enters only numbers or special char in the text fields	
Then Admin should get Error message

#32
Scenario: Validate Cancel button on Edit popup
Given Admin is on editUser details pop up	
When Admin clicks Cancel button on edit popup	
Then Admin can see the User details popup disappears and can see nothing changed for particular User