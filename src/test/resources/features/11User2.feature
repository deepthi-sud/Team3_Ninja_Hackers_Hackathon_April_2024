Feature: Add new user


  Background: Admin is on dashboard page after Login and clicks User on the navigation bar
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should see a heading with text "Manage user" on the page

 Scenario: Validate login with valid credentials
    Given Admin is in Home Page
    When Admin enter valid credentials  and clicks login button 
    Then Admin should land on dashboard page
    
    Scenario: Validate landing in User page
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should see the "Manage User" in the URL

    
  #  16
Scenario: Validate User Details Popup window
Given Admin is on Manage User Page
When Admin clicks "+ A New User" button
Then Admin should see pop up open for user details 

#17
Scenario: Validate input fields and text boxes in user details form
Given Admin is on Manage User Page
When Admin clicks "+ A New User" button
Then Admin should see text boxes for the fields 

#18
Scenario: Validate drop downs in new user form
Given Admin is on Manage User Page
When Admin clicks "+ A New User" button
Then Admin should see drop downs for the fields User Role,Role status, visa status on user details pop up

#19
Scenario: Check if user is created when only mandatory fields are entered with valid data
Given Admin is on  User details pop up
When Admin enters mandatory fields in the form and clicks on submit button
Then Admin gets message User added Successfully

#20
Scenario: Check if user is created when only optional fields are entered with valid data
Given Admin is on  User details pop up
When Admin skips to add value in mandatory field
Then Admin should see error message below the test field and the field will be highlighed in red color

#21
Scenario: check if user is created when invalid data is entered in all of the fields
Given Admin is on  User details pop up
When Admin enters invalid data in all of the  fields in the form and clicks on submit button
Then Admin gets error message and user is not created

#22
Scenario: Empty form submission
Given Admin is on  User details pop up
When Admin clicks on submit button without entering data
Then user wont be created and Admin gets error message

#23
Scenario: Validate Cancel/Close(X) icon on User Details form
Given Admin is on  User details pop up
When Admin clicks Cancel/Close(X) Icon on User Details form
Then User Details popup window should be closed without saving

#24
Scenario: Validate Cancel button on User Details form
Given Admin is on  User details pop up
When Admin clicks Cancel button
Then Admin can see the User details popup disappears without adding any user

#25
Scenario: Check if the user details are added in data table
Given Admin is on  User details pop up
When Fill in all the fields with valid values and click submit
Then The newly added user should be present in the data table in Manage User page

