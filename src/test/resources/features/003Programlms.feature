@program
Feature: Validating program page

#Manage Program Page

Background: Validate login with valid credentials
    Given Admin is in Home Page
    When Admin enter valid credentials  and clicks login button 
    Then Admin should land on dashboard page

Scenario: Verify landing in Program page
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see URL with Manage Program

Scenario: Verify the heading
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see a heading with text "Manage Program" on the page

Scenario: Verify the text and pagination icon below the data table
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see the text as "Showing x to y of z entries" along with Pagination icon below the table. 


Scenario: Verify the footer
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see the footer as "In total there are z programs"

Scenario: Verify the default state of Delete button
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see a Delete button on the top left hand side as Disabled

Scenario: Verify add new program
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see a "+A New Program" button on the program page above the data table

Scenario: Verify that number of records displayed
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see the number of records (rows of data in the table) displayed on the page are 5

Scenario: Verify data table on the Program page
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see data table on the Manage Program Page with following column headers (Program Name, Program Description, Program Status, Edit,Delete)

Scenario: Verify sort arrow icon on the data table
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see the sort arrow icon beside to each column header except Edit and Delete

Scenario: Verify check box on the data table
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see check box on the left side in all rows of the data table 

Scenario: Verify edit and delete button
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see the Edit and Delete buttons on each row of the data table

Scenario: Verify search bar on the program page
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see Search bar with text as "Search..."

#Add New Program

Scenario: Validate program details popup window
Given Admin is on Manage Program Page
When Admin clicks "A New Program" button
Then Admin should see a popup open for Program details with empty form along with <SAVE> and <CANCEL> button and Close(X) Icon on the top right corner of the window

Scenario: Validate input fields and their text boxes in program details form
Given Admin is on Manage Program Page
When Admin clicks "A New Program" button
Then Admin should see two input fields and their respective text boxes in the program details window

Scenario: Validate radio button for programstatus
Given Admin is on Manage Program Page
When Admin clicks "A New Program" button
Then Admin should see two radio button for Program Status

#Edit Program Details


Scenario: Validate edit feature
Given Admin is on Manage Program Page
When Admin clicks <Edit>button on the data table for any row
Then Admin could see a popup open for Program details to edit


































