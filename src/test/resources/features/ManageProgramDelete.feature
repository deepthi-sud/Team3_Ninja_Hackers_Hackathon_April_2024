#@ProgramDeletion
#Feature: Delete Program
#
#Background: User is Logged In
#	Given I navigate to the login page
#	When I submit username and password
#	Then I should be logged in 
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
 #delete-03
 #Scenario: Click Yes on deletion window
   #Given Admin clicks <Delete> button on the data table for any row
   #Given Admin is on Confirm Deletion alert
   #When Admin clicks <YES> button on the alert
   #Then Admin gets a message "Successful Program Deleted" alert and able to see that program deleted in the data table
 #
    #
#delete-04
  #Scenario: Click No on deletion window
  #Given Admin clicks <Delete> button on the data table for any row
  #Given Admin is on Confirm Deletion alert
  #When Admin clicks <NO> button on the alert
  #Then Admin can see the deletion alert disappears without deleting
  #
  # delete-05
  #Scenario: Validate Cancel/Close(X) icon on Confirm Deletion alert
  #Given Admin clicks <Delete> button on the data table for any row
  #Given Admin is on Confirm Deletion alert
  #When Admin clicks Cancel/Close(X) Icon on Deletion alert
  #Then Admin can see the deletion alert disappears without any changes
#
#
#multipledeletion-06
#
  #Scenario: Validate Common Delete button enabled after clicking on any checkbox
   #Given Admin is on Manage Program page
   #When Admin clicks any checkbox in the data table
   #Then Admin should see common delete option enabled under header Manage Program
   #
   #
#mulipledeletion-7
#
#Scenario: Validate multiple program deletion by selecting Single checkbox
  #Given Admin is on confirm Deletion alert
  #When Admin clicks <YES> button on the alert
  #Then Admin should land on Manage Program page and can see the selected program is deleted from the data table
  #
#multipledeletion-08
#
#Scenario:Validate multiple program deletion by selecting Single checkbox
  #Given Admin is on confirm Deletion alert
  #When Admin clicks <NO> button on the alert
  #Then Admin should land on Manage Program page and can see the selected program is not deleted from the data table
  #
  #multipledeletion-9
  #Scenario: Validate multiple program deletion by selecting multiple check boxes
  #Given Admin is on Confirm deletion alert
  #When Admin clicks <YES> button on the alert
  #Then Admin should land on Manage Program page and can see the selected programs are deleted from the data table
  #
  #multipledeletion-10
  #Scenario:Validate multiple program deletion by selecting multiple check boxes
    #Given Admin is on Confirm deletion alert
    #When Admin clicks <NO> button on the alert 
    #Then Admin should land on Manage Program page and can see the selected programs are not deleted from the data table
