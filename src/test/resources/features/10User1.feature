Feature: User page validation

 Scenario: Validate login with valid credentials
    Given Admin is in Home Page
    When Admin enter valid credentials  and clicks login button 
    Then Admin should land on dashboard page
    
    Scenario: Validate landing in User page
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should see the "Manage User" in the URL


Scenario: search user by name
Given Admin is on Manage User Page
When Admin enters user name into search box.
Then Admin should see user displayed with the entered name


Scenario: Validating the Search with unrelated keyword
Given Admin is on Manage User Page
When Admin enters the keywords not present in the data table on the Search box 
Then Admin should see zero entries on the data table

