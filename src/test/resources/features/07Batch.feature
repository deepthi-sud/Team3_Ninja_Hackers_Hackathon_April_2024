
Feature: Batch Page Validation

#Background: 
#Given Admin enters url
#When Admin enters valid credentials and then click on login button
#Then Admin navigates to Learning Management System Page


Scenario: Validate header in the Batch Page
Given Admin is on dashboard page after Login
When Admin clicks "Batch" from navigation bar
Then Admin should see the "Manage Batch" in the URL and in the header

Scenario: Validate pagination in the Batch Page
Given Admin is on dashboard page after Login
When Admin clicks "Batch" from navigation bar
Then Admin should see the pagination controls under the data table


Scenario: Validate data table headers in the Batch Page
Given Admin is on dashboard page after Login
When Admin clicks "Batch" from navigation bar
Then Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No. of classes, Program Name, EditDelete


Scenario: Validate Delete button in Batch Page
Given Admin is on dashboard page after Login
When Admin clicks "Batch" from navigation bar
Then Admin should be able to see the "Delete" icon button that is disabled

Scenario: Validate "+ A New batch" in Batch Page
Given Admin is on dashboard page after Login
When Admin clicks "Batch" from navigation bar
Then Admin should be able to see the "+ A New batch" button

Scenario: Validate data rows
Given Admin is on dashboard page after Login
When Admin clicks "Batch" from navigation bar
Then Each row in the data table should have a checkbox

Scenario: Validate data rows
Given Admin is on dashboard page after Login
When Admin clicks "Batch" from navigation bar
Then Each row in the data table should have a edit icon that is enabled

Scenario: Validate data rows
Given Admin is on dashboard page after Login
When Admin clicks "Batch" from navigation bar
Then Each row in the data table should have a delete icon that is enabled
















