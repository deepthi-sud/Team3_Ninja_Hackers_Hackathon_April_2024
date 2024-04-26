Feature: Validating Login Page

  Scenario: Verify admin is able to land on home page
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should land on the home page
  
  Scenario: Validate login with valid credentials
    Given Admin is in Home Page
    When Admin enter valid credentials  and clicks login button 
    Then Admin should land on dashboard page