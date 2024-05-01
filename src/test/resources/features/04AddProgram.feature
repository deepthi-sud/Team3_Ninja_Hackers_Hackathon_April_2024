#Feature: Validating Add new Program 
#
#Background: Admin is on Manage Program Page after clicks Program on the navigation bar
#Given Admin is on Manage Program Page 
#When Admin clicks "A New Program" button
#Then Admin is on "Program Details" Popup window
#
#Add Program
#
#Scenario: Verify Empty form submission
#Given Admin is on "Program Details" Popup window
#When Admin clicks <Save>button without entering any data
#Then Admin gets a Error message alert 
#
#Scenario: Verify Enter only Program Name
#Given Admin is on "Program Details" Popup window
#When Admin enters only<Program Name> in text box and clicks Save button
#Then Admin gets a description message alert 'Description is required' 
#
#Scenario: Verify Enter only Program description
#Given Admin is on "Program Details" Popup window
#When Admin enters only<Program description> in text box and clicks Save button
#Then Admin gets a name message alert 'Program name is required' 
#
#Scenario: Verify select status only
#Given Admin is on "Program Details" Popup window
#When Admin selects only Status and clicks Save button
#Then Admin gets a name and description message alert 
#
#Scenario: Verify invalid values on the text column
#Given Admin is on "Program Details" Popup window
#When Admin enters only numbers or special char in name and desc column
#Then Admins get a error message alert 
#
#Scenario: Verify cancel/close(x) icon on program details form
#Given Admin is on "Program Details" Popup window
#When Admin clicks Cancel Close(X) Icon on Program Details form
#Then Program Details popup window should be closed without saving
#
#Scenario: Verify save button on program details form
#Given Admin is on "Program Details" Popup window
#When Enter all the required fields with valid values and click Save button
#Then Admin gets a message "Successful Program Created Successfully" alert and able to see the new program added in the data table
#
#Scenario: Verify cancel button on program details form
#Given Admin is on "Program Details" Popup window
#When Admin clicks Cancel button 
#Then Admin can see the Program details popup disappears without creating any program
#
#Edit Program
#
#Scenario: Verify edit program name on Edit window
#Given Admin is on "Program Details" Popup window
#When Admin edit the Name column and clicks save button
#Then Admin gets a message "Successful Program Updated" alert and able to see the updated name in the table for the particular program
#
#Scenario: Verify edit program description on Edit window
#GivenAdmin is on "Program Details" Popup window
#When Admin edit Description column and clicks save button
#Then Admin gets a message "Successful Program Updated" alert and able to see the updated description in the table for the particular program
#
#Scenario: Verify change program status on Edit window
#Given Admin is on "Program Details" Popup window
#When Admin change Status and clicks save button
#Then Admin gets a message "Successful Program Updated" alert and able to see the updated status in the table for the particular program
#
#Scenario: Verify invalid values on the text column on Edit window
#Given Admin is on "Program Details" Popup window 
#When Admin enters only numbers or special char in name and desc column
#Then Admins get a error message alert 
#
#Scenario: Verify cancel button on edit popup on Edit window
#Given Admin is on "Program Details" Popup window
#When Admin clicks Cancel button 
#Then Admin can see the Program details popup disappears and can see nothing changed for particular program
#
#Scenario: Verify save button on edit popup on Edit window
#Given Admin is on "Program Details" Popup window
#When Admin clicks <Save>button 
#Then Admin gets a message "Successful Program Updated" alert and able to see the updated details in the table for the particular program
#
