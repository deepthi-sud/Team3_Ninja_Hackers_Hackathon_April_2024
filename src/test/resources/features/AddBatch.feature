@AddBatch
Feature: Add new Batch

Background: 
Given Admin Logged in LMS portal
When Admin Click on Batch in header and then click on A New Batch button

Scenario: Check if the fields exist in popup
Given A new pop up with Batch details appears
When The pop up should include the fields Name, Number of classes and Description as text box,

Scenario: Invalid Tests
Given A new pop up with Batch details appears
When Admin clicks cancel button
Then Admin should navigate to Manage Batch page


Scenario: InValid tests

Given A new pop up with Batch details appears
When Admin Fill in all the fields except description with valid values   and click on save button


|Name     |TeamTeju4|

|Program Name|TejuTeam01|
|Status|ACTIVE      |
|NoOf Classes|14         |

Then Admin should get Error message

Scenario: Invalid tests
Given A new pop up with Batch details appears
When Admin Fill in all the fields and click on cancel button
Then Admin navigates to manage Batch page



Scenario: Valid tests

Given A new pop up with Batch details appears
When Admin Fill in all the fields  with valid values   and click on save button

|Name     |TeamTeju4|
|Description|Tester       |
|Program Name|TejuTeam01|
|Status|ACTIVE      |
|NoOf Classes|14         |



Scenario: Invalid Test

Given Admin in manage batch page with popup batch details
When Admin enters all the values and click on cancel button
Then Admin navigate to manage batch page

Scenario: 
Given Admin is on popup with batch details
When Admin is Fill in all the fields with valid values and click save
Then   The newly added batch should be present in the data table in Manage Batch page

Scenario:
  Given  Admin checks a new pop up with Batch details appears
    When   Check if any of the fields have invalid values
   

  
  Scenario: Check for error messages for mandatory fields
    Given Admin checks a new pop up with Batch details appears
    When Check any of the mandatory fields are blank
   










