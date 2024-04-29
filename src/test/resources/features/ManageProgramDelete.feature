
@ProgramDeletion
Feature: Delete Program

Background: User is Logged In
	Given I navigate to the login page
	When I submit username and password
	Then I should be logged in 
#
#@delete-01
   #Scenario: Delete Feature
    #Given Admin is on Manage Program page 
    #When Admin clicks <Delete> button on the data table for any row
    #Then Admin should see a alert open with heading "Confirm" along with  <YES> and <NO> button for deletion
    #
#
#@delete-02
   #Scenario: Validate details for Confirm Deletion form
     #Given Admin is on Manage Program page
     #When Admin clicks <Delete> button on the data table for any row
     #Then Admin should see a message "Are you sure you want to delete"
     #
 @delete-03
   Scenario: Click Yes on deletion window
     Given Admin is on Manage Program page
     When Admin clicks <Delete> button on the data table for any row
     And Admin clicks <YES> button on the alert
     Then Admin gets a message "Successful Program Deleted" alert and able to see that program deleted in the data table
 


