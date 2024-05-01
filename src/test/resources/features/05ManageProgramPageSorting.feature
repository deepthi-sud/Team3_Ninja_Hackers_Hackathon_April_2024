
@ManageProgramFeature
Feature: Manage Program Page Sorting(Data Ordering) Validation

Background: User is Logged In
	Given I navigate to the login page
	When I submit username and password
	Then I should be logged in 

  @sorting_01
  Scenario: Validates Descending Sorting(data ordering) on the Program Data table
    Given Admin is on Manage Program page
    When Admin clicks the sort icon of program name column
    Then The data get sorted on the table based on the program name column values in ascending order
 
 
 @sorting_02
  Scenario: Validates Ascending Sorting(data ordering) on the Program Data table
    Given Admin clicks the sort icon of program name column
    Given The data is in the ascending order on the table based on Program Name column
    When Admin clicks the sort icon of program name column
    Then The data get sorted on the table based on the program name column values in descending order


  @sorting-03
  Scenario: Validates Sorting(data ordering) on the Program Data table
    Given Admin is on Manage Program page
    When Admin clicks the sort icon of program Desc column
    Then The data get sorted on the table based on the program description column values in ascending order
  
  @sorting-04
  Scenario: Validates Sorting(data ordering) on the Program Data table
   Given Admin clicks the sort icon of program Desc column
   Given The data is in the ascending order on the table based on Program Description column
   When Admin clicks the sort icon of program Desc column
   Then The data get sorted on the table based on the program description column values in descending order
   
   @sorting_05
   Scenario: Validates Sorting(data ordering) on the Program Data table
     Given Admin is on Manage Program page
 	   When Admin clicks the sort icon of program Status column
 	   Then The data get sorted on the table based on the program status column values in ascending order

   @sorting-06
   Scenario: Validates Sorting(data ordering) on the Program Data table 
   Given Admin clicks the sort icon of program Status column
   Given The data is in the ascending order on the table based on Program Status column
   When Admin clicks the sort icon of program Status column
   Then The data get sorted on the table based on the program status column values in descending order  
   
   
   