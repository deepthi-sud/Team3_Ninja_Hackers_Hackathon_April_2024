
@userSort
Feature: user-sort

Background: User is Logged In
	Given I navigate to the login page
	When I submit username and password
	Then I should be logged in 
	
  @sort-01
  Scenario: Sort user by id
    Given Admin is on Manage User Page
    When Admin clicks on ID sort icon
    Then Admin should see User details are sorted by id
    
  @sort-02
  Scenario: Sort user by name
    Given Admin is on Manage User Page
    When Admin clicks on name sort icon
    Then Admin should see User details are sorted by name
   
   @sort-03
   Scenario: Sort user by Location
     Given Admin is on Manage User Page
     When Admin clicks on Location sort icon
     Then Admin should see User details are sorted by Location
     
   @sort-4
   Scenario: Sort user by Phone number
     Given Admin is on Manage User Page
     When Admin clicks on Phone number sort icon
     Then Admin should see User details are sorted by Phone number
     