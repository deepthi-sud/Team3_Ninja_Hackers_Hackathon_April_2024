Feature: Validate the Log out feature

  Scenario: Verify Logout button function
    Given Admin is dashboard page
    When Admin click Logout button on navigation bar
    Then Admin should land on login in page
