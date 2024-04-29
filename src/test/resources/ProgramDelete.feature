
@ProgramDeletion
Feature: Delete Program

@delete-01
   
  Scenario: Delete Feature
    Given Admin is on Manage Program Page 
    When Admin clicks <Delete> button on the data table for any row
    Then Admin should see a alert open with heading "Confirm" along with  <YES> and <NO> button for deletion
    

