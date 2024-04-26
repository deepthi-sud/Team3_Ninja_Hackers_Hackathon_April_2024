@mainLoginPage
Feature: Validating Login Page

@loginPageValidation_TC01
  Scenario: Verify admin is able to land on home page
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should land on the home page
  
 @loginPageValidation_TC02
  Scenario: Verify admin is able to land on home page with invalid URL
    Given Admin launch the browser
 		When Admin gives the invalid LMS portal URL
    Then Admin should recieve 404 page not found error 
    
  @loginPageValidation_TC03
  Scenario: Verify admin is able to land on home page with invalid URL
    Given Admin launch the browser
 		When Admin gives the invalid LMS portal URL
    Then Admin should recieve 404 page not found error   
    
   @loginPageValidation_TC04
  	Scenario Outline: Verify the text spelling in the page
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see correct spellings in all fields  
        
    @loginPageValidation_TC05
  	Scenario Outline: Verify the company logo
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see logo on the left side 

  @loginPageValidation_TC06
  	Scenario Outline: Verify application name
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see LMS Learning Management System
  
  @loginPageValidation_TC07
  	Scenario Outline: Verify company name
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see company name below the app name
    
    @loginPageValidation_TC08
  	Scenario Outline: Validate sign in content
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see Please login to LMS application
    
   @loginPageValidation_TC09
  	Scenario Outline: Verify text field is present
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see two text field
  
     @loginPageValidation_TC10
  	Scenario Outline: Verify text on the first text field
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should "User" in the first text field
    
    @loginPageValidation_TC11
  	Scenario Outline: Verify asterik next to user text
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see "*" symbol next to user text
    
    @loginPageValidation_TC12
  	Scenario Outline: Verify text on the first text field
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should "Password" in the second text field
    
    @loginPageValidation_TC13
  	Scenario Outline: Verify asterik next to user text
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see "*" symbol next to user text
  
    @loginPageValidation_TC14
  	Scenario Outline: Verify the alignment input field for the login
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see input field on the centre of the page
  
   @loginPageValidation_TC15
  	Scenario Outline: verify Login is present
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see login button
  
    @loginPageValidation_TC16
  	Scenario Outline: Verify the alignment of the login button
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Verify the alignment of the login button
  
   @loginPageValidation_TC17
  	Scenario Outline: Verify input descriptive test in user field
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see user in gray color
  
  @loginPageValidation_TC18
  	Scenario Outline: Verify input descriptive test in password field
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see password in gray color
  
  @loginPageValidation_TC19
  Scenario: Validate login with valid credentials
    Given Admin is in Home Page
    When Admin enter valid credentials and clicks login button 
    Then Admin should land on dashboard page
    
      
    