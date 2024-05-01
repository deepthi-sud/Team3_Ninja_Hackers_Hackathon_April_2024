Feature: User page validation

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

    #14
Scenario: search user by name
Given Admin is on Manage User Page
When Admin enters user name into search box.
Then Admin should see user displayed with the entered name

#15
Scenario: Validating the Search with unrelated keyword
Given Admin is on Manage User Page
When Admin enters the keywords not present in the data table on the Search box 
Then Admin should see zero entries on the data table

