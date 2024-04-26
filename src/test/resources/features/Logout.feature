@logout
Feature: Validate the Log out feature

  Background: Admin  is in dashboard page after logged in
    Given Admin is in Home Page
    When Admin enter valid credentials  and clicks login button 
    Then Admin should land on dashboard page

  Scenario: Verify Logout button function
    Given Admin is dashboard page
    When Admin click Logout button on navigation bar
    Then Admin should land on login in page
