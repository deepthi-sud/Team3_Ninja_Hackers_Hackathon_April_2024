Feature: Delete user

Scenario: Validate login with valid credentials
    Given Admin is in Home Page
    When Admin enter valid credentials  and clicks login button 
    Then Admin should land on dashboard page
    
    Scenario: Validate landing in User page
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should see the "Manage User" in the URL

#37
Scenario: Validate row level delete icon
Given Admin is on Manage User Page	
When Admin clicks the delete icon	
Then Admin should see a alert open with heading "Confirm" along with  <YES> and <NO> button for deletion

#38
Scenario: Click Yes on deletion window
Given Admin is on Confirm Deletion alert	
When Admin clicks yes option	
Then Admin gets a message "Successful User Deleted" alert and do not see that user in the data table

#39
Scenario: Click No on deletion window
Given Admin is on Confirmation Deletion alert	
When Admin clicks  No option	
Then Admin can see the deletion alert disappears without deleting

#40
Scenario: Validate Close(X) icon on Confirm Deletion alert
Given Admin is on Confirm Deletion alert for close
When Admin clicks on close button	
Then Admin can see the deletion alert disappears without any changes
