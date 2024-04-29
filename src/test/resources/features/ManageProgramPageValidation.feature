
@Validation-page
Feature: Navigation Validation from Manage Program to other Pages
  Background: User is Logged In
	  Given I navigate to the login page
	  When I submit username and password
  	Then I should be logged in 

  @PageValidation-01
  Scenario: Batch link on navigation bar
    Given Admin is on Manage Program page
    When Admin clicks on Batch link on Manage Program page
    Then Admin is re-directed to Batch page
    
   @pageValidation-02
   Scenario: User link on navigation bar
     Given Admin is on Manage Program page
     When Admin clicks on User link on Manage Program page
     Then Admin is re-directed to User page
     
   @pageValidation-03
   Scenario: User link on navigation bar
     Given Admin is on Manage Program page
     When Admin clicks on Logout link on Manage Program page
     Then Admin is re-directed to Login page
   
   
@paginatior-04
   Scenario: Verify Next page link
     Given Admin is on Manage Program page
     When Admin clicks Next page link on the program table 
     Then Admin should see the Pagination has "Next" active link
      
 @paginator-05
   Scenario: Verify Next page link
     Given Admin is on Manage Program page
     When Admin clicks Last page link
     Then Admin should see the last page record on the table with Next page link are disabled
  @paginator-06
  Scenario: Verify First page link
    Given Admin is on last page of Program table
    When Admin clicks First page link
    Then Admin should see the next page record on the table with pagination has next page link
     
  @paginator-07
  Scenario: Verify Start page link
  Given Admin is on Previous Program page 
  When Admin clicks Start page link
  Then Admin should see the very first page record on the table with Previous page link are disabled