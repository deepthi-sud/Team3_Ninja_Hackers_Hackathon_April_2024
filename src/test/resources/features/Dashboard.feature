Feature: Validating Dashboard page

  Background: Admin gives the correct LMS portal URL
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should land on the home page

  Scenario: Verify after login  admin lands on manage program as dashboard page
    Given Admin is in Home Page
    When Admin enter valid credentials  and clicks login button
    Then Admin should see manage program as header
