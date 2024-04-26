Feature: Validating program page

#Manage Program Page

#Background: Login with valid credentials
    #Given Admin launch the browser
    #When Admin enter username and password  
    #Then Admin navigate to main page with heading "Manage Program"
#
#Scenario: Verify landing in Program page
#Given Admin is on dashboard page after Login
#When Admin clicks "Program" on the navigation bar
#Then Admin should see URL with Manage Program
#
#Scenario: Verify the heading
#Given Admin is on dashboard page after Login
#When Admin clicks "Program" on the navigation bar
#Then Admin should see a heading with text " Manage Program" on the page

#Scenario: Verify the text and pagination icon below the data table
#Given Admin is on dashboard page after Login
#When Admin clicks "Program" on the navigation bar
#Then Admin should see the text as "Showing x to y of z entries" along with Pagination icon below the table. 
#x- starting record number on that page y-ending record number on that page z-Total number of records
#
#Scenario: Verify the footer
#Given Admin is on dashboard page after Login
#When Admin clicks "Program" on the navigation bar
#Then Admin should see the footer as "In total there are z programs"
#z- Total number of records
#
#Scenario: Verify the default state of Delete button
#Given Admin is on dashboard page after Login
#When Admin clicks "Program" on the navigation bar
#Then Admin should see a Delete button on the top left hand side as Disabled
#
#Scenario: Verify add new program
#Given Admin is on dashboard page after Login
#When Admin clicks "Program" on the navigation bar
#Then Admin should see a "+A New Program" button on the program page above the data table
#
#Scenario: Verify that number of records displayed
#Given Admin is on dashboard page after Login
#When Admin clicks "Program" on the navigation bar
#Then Admin should see the number of records (rows of data in the table) displayed on the page are 5
#
#Scenario: Verify data table on the Program page
#Given Admin is on dashboard page after Login
#When Admin clicks "Program" on the navigation bar
#Then Admin should see data table on the Manage Program Page with following column headers (Program Name, Program Description, Program Status, Edit,Delete)
#
#Scenario: Verify sort arrow icon on the data table
#Given Admin is on dashboard page after Login
#When Admin clicks "Program" on the navigation bar
#Then Admin should see the sort arrow icon beside to each column header except Edit and Delete
#
#Scenario: Verify check box on the data table
#Given Admin is on dashboard page after Login
#When Admin clicks "Program" on the navigation bar
#Then Admin should see check box on the left side in all rows of the data table 
#
#Scenario: Verify edit and delete button
#Given Admin is on dashboard page after Login
#When Admin clicks "Program" on the navigation bar
#Then Admin should see the Edit and Delete buttons on each row of the data table
#
#Scenario: Verify search bar on the program page
#Given Admin is on dashboard page after Login
#When Admin clicks "Program" on the navigation bar
#Then Admin should see Search bar with text as "Search..."