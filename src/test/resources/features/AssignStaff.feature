#Feature: Validating Assign Staff in User Page
#
  #Background: Admin is on Manage User Page after clicks User on the navigation bar
    #Given Admin logged on the LMS portal
    #When Admin is on dashboard page after Login
    #Then Admin clicks "User" from navigation bar

  #Scenario: Validate Assign Staff Popup window
  #Given Admin is in manage user page
  #When Admin clicks "Assign Staff" button
  #Then Admin should see a pop up open for assign staff details with empty form along with Save and Cancel button and close (X) icon on the top right corner of the window
  #Scenario: Validate input fields and their text boxes in Assign Staff form
  #Given Admin is in manage user page
  #When Admin clicks "Assign Staff" button
  #Then Admin should see User Role as R02,and other fields Student Email id,Skill,Program Name,Batch Name and Status with respective input boxes.
  #Scenario: Validate Dropdown in Assign Staff Form
  #Given Admin is in manage user page
  #When Admin clicks "Assign Staff" button
  #Then Admin should see drop down boxes with valid datas for Student Email id,Program Name and Batch Name
  #Scenario: Validate radio button in Assign Staff Form
  #Given Admin is in manage user page
  #When Admin clicks "Assign Staff" button
  #Then Admin should see two radio button for Status
  
  #Scenario: Empty Form Submission
  #Given Admin is in Assign Staff details pop up page
  #When Admin clicks "Save" button with out entering any data
  #Then Admin gets a Error message alert
  
  #Scenario: Validate the Assign Staff form page without giving Student Email id
  #Given Admin is in Assign Staff details pop up page
  #When Admin clicks "Save" button without entering Student Email id
  #|Skill|Tester|
  #|Program Name|Team3 pgm|
  #|Batch Name|batchTeam3|
  #|Status |Active|
  #Then Admin gets a Error message alert as "Student Email id is required"
  #Scenario: Validate the Assign Staff form page without giving Skill
  #Given Admin is in Assign Staff details pop up page
  #When Admin clicks "Save" button without entering Skill
  #|Staff Email Id|staffninja@gmail.com|
  #|Program Name|Team3 pgm|
  #|Batch Name|batchTeam3|
  #|Status |Active|
  #Then Admin gets a Error message alert as "Skill is required"
  #
  #Scenario: Validate the Assign Staff form page without selecting Program
  #Given Admin is in Assign Staff details pop up page
  #When Admin clicks "Save" button without selecting program
  #|Staff Email Id|staffninja@gmail.com|
  #|Skill|Tester|
  #|Batch Name|batchTeam3|
  #|Status |Active|
  #Then Admin gets a Error message alert as "Program is required"
  #
  #Scenario: Validate the Assign Staff form page without selecting batch
  #Given Admin is in Assign Staff details pop up page
  #When Admin clicks "Save" button without selecting batch
  #|Staff Email Id|staffninja@gmail.com|
  #|Skill|Tester|
  #|Batch Name|batchTeam3|
  #|Status |Active|
  #Then Admin gets a Error message alert as "Batch is required"
  #
  #Scenario: Validate the Assign Staff form page without giving Status
  #Given Admin is in Assign Staff details pop up page
  #When Admin clicks "Save" button without giving status
  #|Staff Email Id|staffninja@gmail.com|
  #|Skill|Tester|
  #|Program Name|Team3 pgm|
  #|Batch Name|batchTeam3|
  #Then Admin gets a Error message alert as "Status is required"
  #
  #Scenario: Validate Cancel/Close(X) icon on Assign Staff form
    #Given Admin is in Assign Staff details pop up page
    #When Admin clicks Cancel/Close(X) Icon on Assign Staff form
    #Then Assign Staff popup window should be closed without saving

  #
  #Scenario: Validate Save button on Assign Staff form
  #Given Admin is in Assign Staff details pop up page
  #When Enter all the required fields with valid values and click Save button
  #Then Admin gets a message "Successfully Staff Assigned" alert
  ##|Staff Email Id|staffninja@gmail.com|
  #|Skill|Tester|
  #|Program Name|Team3 pgm|
  #|Batch Name|batchTeam3|
  #|Status |Active|
  #Scenario: Validate Cancel button on Assign Staff form
    #Given Admin is in Assign Staff details pop up page
    #When Admin clicks <Cancel>button
    #Then Admin can see the Assign Staff popup disappears without assigning
