Feature: User page validation

  #Scenario: Validate login with valid credentials
    #Given Admin is in Home Page
    #When Admin enter valid credentials  and clicks login button
    #Then Admin should land on dashboard page

  #1
  Scenario: Validate landing in User page
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should see the "Manage User" in the URL

  #2
  Scenario: Validate the heading
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should see a heading with text "Manage user" on the page

  #3
  Scenario Outline: Validate the text and pagination icon below the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should see the text as "Showing x to y of z entries" along with Pagination icon below the table

    Examples: 
      | x  | y  | z  |
      |  1 |  5 | 77 |
      |  6 | 10 | 77 |
      | 11 | 15 | 77 |
      | 16 | 20 | 77 |
      | 21 | 25 | 77 |
      | 26 | 30 | 77 |
      | 31 | 35 | 77 |
      | 36 | 40 | 77 |
      | 41 | 45 | 77 |
      | 46 | 50 | 77 |
      | 51 | 55 | 77 |
      | 56 | 60 | 77 |
      | 61 | 65 | 77 |
      | 66 | 70 | 77 |
      | 71 | 75 | 77 |
      
    

  #4
  Scenario Outline: Validate the texts and pagination icon below the data table
    Given Admin is on dashboard page after Login
    Then Admin should see the text as "Showing x to y of z entries"

    Examples: 
      | x  | y  | z  |
      | 76 | 77 | 77 |
      


  #4
  Scenario: Validate data table headers in the User Page
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin Should see the data table with column names Id, Name, location, Phone Number, Edit/Delete

 # 5
  Scenario: Validating the default state of Delete button
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should see a {deleteIcon} button on the top left hand side as Disabled
    
 #   6
    Scenario: Validate "+ A New user" button in User Page
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should be able to see the "addnewUser" button above the data table
    
   #  7
    Scenario: Validate "+ Assign Student"  button in User page
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should be able to see the "assignStudent" button above the data table
    
   #  8
    Scenario: Validate "+ Assign staff"  button in User page
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should be able to see the "assignStaff" button above the data table
    
   # 9
    Scenario: Validate search box in User page
    Given Admin is on dashboard page after Login	
    When Admin clicks "User" from navigation bar	
    Then Admin should be able to see the "searchInput" text box above the data table
    
   # 10
		Scenario: Validate number of data rows in the data table
		Given Admin is on dashboard page after Login
		When Admin clicks "User" from navigation bar
		Then Admin should see two  records displayed on the data table

#11
Scenario: Verify Check box on the data table
Given Admin is on dashboard page after Login
When Admin clicks "User" from navigation bar
Then Each row in the data table should have a checkbox

#12
Scenario: Verify edit icon on the data table
Given Admin is on dashboard page after Login
When Admin clicks "User" from navigation bar
Then Each row in the data table should have a edit icon that is enabled

#13
Scenario: Verify  delete icon on the data table
Given Admin is on dashboard page after Login
When Admin clicks "User" from navigation bar
Then Each row in the data table should have a delete icon that is enabled


