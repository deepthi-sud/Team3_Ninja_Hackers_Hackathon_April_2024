Feature: Validating Dashboard page

  Background: Admin gives the correct LMS portal URL
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should land on the home page

  Scenario: Verify after login  admin lands on manage program as dashboard page
  Given Admin is in Home Page
  When Admin enter valid credentials  and clicks login button
  Then Admin should see manage program as header
  
  Scenario: Verify the response time
  Given Admin is in Home Page
  When Admin enter valid credentials  and clicks login button
  Then Maximum navigation time in milliseconds, defaults to 30 seconds
  
  Scenario: Verify broken link
  Given Admin is in Home Page
  When Admin enter valid credentials  and clicks login button
  Then HTTP response >= 400. Then the link is broken
  
  Scenario: Verify LMS title
  Given Admin is in Home Page
  When Admin enter valid credentials  and clicks login button
  Then Admin should see LMS -Learning management system  as title
  
  Scenario: Verify  LMS title alignment
  Given Admin is in Home Page
  When Admin enter valid credentials  and clicks login button
  Then LMS title should be on the top left corner of page
  
  Scenario: Validate navigation bar text
  Given Admin is in Home Page
  When Admin enter valid credentials  and clicks login button
  Then Admin should see correct spelling in navigation bar text
  
  Scenario: Validate LMS title has correct spelling ang space
  Given Admin is in Home Page
  When Admin enter valid credentials  and clicks login button
  Then Admin should see correct spelling and space in LMS title
  
  Scenario: Validate alignment for navigation bar
  Given Admin is in Home Page
  When Admin enter valid credentials  and clicks login button
  Then Admin should see the navigation bar text on the top right side
  
  Scenario: Validate navigation bar order 1st Program
    Given Admin is in Home Page
    When Admin enter valid credentials  and clicks login button
    Then Admin should see program in the 1st place

  Scenario: Validate navigation bar order  2nd Batch
    Given Admin is in Home Page
    When Admin enter valid credentials  and clicks login button
    Then Admin should see batch in the 2nd place 

  Scenario: Validate navigation bar order 3rd User
    Given Admin is in Home Page
    When Admin enter valid credentials  and clicks login button
    Then Admin should see user in the  3rd place

  Scenario: Validate navigation bar order 4th Logout
    Given Admin is in Home Page
    When Admin enter valid credentials  and clicks login button
    Then Admin should see logout in the 4th place
