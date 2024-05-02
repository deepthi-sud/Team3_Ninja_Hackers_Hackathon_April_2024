#Feature: Delete Batch
#
#Background: 
#Given Admin logged into LMS portal
#When Admin clicks on Batch from navigation bar
#Then Admins is on Manage Batch Page
#
#Scenario: Validate row level delete icon
#Given  Admin is on Manage Batch Page 
#When Admin should clicks the delete icon
#Then Alert appears with yes and No option
#
#Scenario: Validate accept alert
#Given Admin is on Manage Batch Page 
#When Admin  clicks on yes option
#Then Batch deleted alert pops and batch is no more available in data table
#
#Scenario: Validate reject alert
#Given Admin is on Manage Batch Page
#When Admin clicks the delete icon and  click No option
#Then Batch is still listed in data table
#
#Scenario: Validate the delete icon below the header 
#Given Admin is on Manage Batch Page
#When None of the checkboxes in data table are selected
#Then The delete icon under the "Manage Batch" header should be disabled
#@delete5
#Scenario: Check for single row delete
#Given  Admin is on Manage Batch Page
#When Admin selects one of the checkbox and  delete icon below "Manage Batch" header
#Then The respective row in the data table is deleted
#
#Scenario: Check for multi row delete
#Given Admin is on Manage Batch Page 
#When  Admin selects Two or more checkboxes row and Click delete icon below "Manage Batch" header
#Then The respective row in the data table is deleted
#
#
#@EDIT
#
#Scenario: Validate row level edit icon
#Given Admin is on Manage Batch Page
#When Admin clicks the edit icon for "Team3 Batch"
#Then A new pop up with Batch details appears
#
#Scenario: Check if the fields are updated
#Given Admin is on Manage Batch Page
#When Admin Update the fields with valid values and click save
#Then The updated batch details should appear on the data table
#
#Scenario: Check if the update throws error with invalid valued
#Given Admin is with batch popup details 
#When Admin Update the fields with invalid values and click save
#Then Error message should EDIT appear
#
#Scenario: Check if you get error message when mandatory fields are erased
#Given Admin is on Manage Batch Page
#When Admin clicks edit icon and Erase data from mandatory field
#Then Error message should EDIT appear
#
#Scenario: Search Text Box
#Given Admin is on Manage Batch Page
#When Admin enters batch name in search 
#Then Admin should see that particular batch with respective details
#
#Scenario: 
#Given Admin is on Manage Batch Page
#When click on edit button of bath name isearch in textbox and update any fields click save
#Then Admin able to see updated message 
#
#
#
