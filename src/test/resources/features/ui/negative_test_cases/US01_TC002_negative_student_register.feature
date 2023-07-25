 @US01_NegativeTest

Feature: Student Registration

  Background:
    Given user navigates to url
    Then user clicks on register

  @TC002_student_register
  Scenario: TC_002 User enters empty name - Negative Test
    Given User is on registration page
    When User enters empty name
    And User enters surname
    And Surname must contain any character and cannot be left blank
    And User enters their birth place
    And Birth place must contain any character and cannot be left blank
    And User enters their phone number
    And User selects their gender
    And User enters their date of birth
    And User enters SSN
    And SSN; must contain ‘-’ after the 3rd and 5th digits and consist of 9 digits
    And User enters User Name
    And User enters their password
    And Password must consist of at least 8 characters
    And Password must contain at least one uppercase letter, one lowercase letter and one digit
    And User clicks on register button
    And User should see "Required"alert
    Then close the application

  @TC003_student_register
  Scenario: TC_003 User enters name with special characters or numbers - Negative Test
    Given User is on registration page
    And User enters a name with special characters or numbers.
    And User enters surname
    And Surname must contain any character and cannot be left blank
    And User enters their birth place
    And Birth place must contain any character and cannot be left blank
    And User enters their phone number
    And User selects their gender
    And User enters their date of birth
    And User enters SSN
    And SSN; must contain ‘-’ after the 3rd and 5th digits and consist of 9 digits
    And User enters User Name
    And User enters their password
    And Password must consist of at least 8 characters
    And Password must contain at least one uppercase letter, one lowercase letter and one digit
    And User clicks on register button
    Then User should not see "Guest User Registered" alert
    Then close the application

  @TC004_student_register
  Scenario: TC_004 User enters empty surname - Negative Test
    Given User is on registration page
    When User enters name
    And name must contain any character and cannot be left blank
    And User enters empty surname
    And User should see "Required"alert
    Then close the application

  @TC005_student_register
  Scenario: TC_005 User enters a surname with special characters or numbers - Negative Test
    Given User is on registration page
    When User enters name
    And name must contain any character and cannot be left blank
    And User enters a surname with special characters or numbers
    And User enters their birth place
    And Birth place must contain any character and cannot be left blank
    And User enters their phone number
    And User selects their gender
    And User enters their date of birth
    And User enters SSN
    And SSN; must contain ‘-’ after the 3rd and 5th digits and consist of 9 digits
    And User enters User Name
    And User enters their password
    And Password must consist of at least 8 characters
    And Password must contain at least one uppercase letter, one lowercase letter and one digit
    And User clicks on register button
    Then User should not see "Guest User Registered" alert
    Then close the application

  @TC006_student_register
  Scenario: TC_006 User enters an empty birth place - Negative Test
    Given User is on registration page
    When User enters name
    And name must contain any character and cannot be left blank
    And User enters surname
    And Surname must contain any character and cannot be left blank
    And User enters an empty birth place
    And User should see "Required"alert
    Then close the application

  @TC007_student_register
  Scenario: TC_007 User enters an empty phone number - Negative Test
    Given User is on registration page
    When User enters name
    And name must contain any character and cannot be left blank
    And User enters surname
    And Surname must contain any character and cannot be left blank
    And User enters their birth place
    And Birth place must contain any character and cannot be left blank
    And User enters an empty phone number
    And User should see "Required"alert
    Then close the application

  @TC008_student_register
  Scenario: TC_008 User enters an invalid phone number - Negative Test
    Given User is on registration page
    When User enters name
    And name must contain any character and cannot be left blank
    And User enters surname
    And Surname must contain any character and cannot be left blank
    And User enters their birth place
    And Birth place must contain any character and cannot be left blank
    And User enters an invalid phone number
    And User selects their gender
    And User enters their date of birth
    And User enters SSN
    And SSN; must contain ‘-’ after the 3rd and 5th digits and consist of 9 digits
    And User enters User Name
    And User enters their password
    And Password must consist of at least 8 characters
    And Password must contain at least one uppercase letter, one lowercase letter and one digit
    And User clicks on register button
    Then User should not see "Guest User Registered" alert
    Then close the application

  @TC009_student_register
  Scenario: TC_009 User does not select a gender - Negative Test
    Given User is on registration page
    When User enters name
    And name must contain any character and cannot be left blank
    And User enters surname
    And Surname must contain any character and cannot be left blank
    And User enters their birth place
    And Birth place must contain any character and cannot be left blank
    And User enters their phone number
    And User does not select a gender
    And User enters their date of birth
    And User enters SSN
    And SSN; must contain ‘-’ after the 3rd and 5th digits and consist of 9 digits
    And User enters User Name
    And User enters their password
    And Password must consist of at least 8 characters
    And Password must contain at least one uppercase letter, one lowercase letter and one digit
    And User clicks on register button
    Then User should not see "Guest User Registered" alert
    Then close the application

  @TC0010_student_register
  Scenario: TC_0010 User enters an invalid date of birth - Negative Test
    Given User is on registration page
    When User enters name
    And name must contain any character and cannot be left blank
    And User enters surname
    And Surname must contain any character and cannot be left blank
    And User enters their birth place
    And Birth place must contain any character and cannot be left blank
    And User enters their phone number
    And User selects their gender
    And User enters an invalid date of birth
    And User enters SSN
    And SSN; must contain ‘-’ after the 3rd and 5th digits and consist of 9 digits
    And User enters User Name
    And User enters their password
    And Password must consist of at least 8 characters
    And Password must contain at least one uppercase letter, one lowercase letter and one digit
    And User clicks on register button
    Then User should not see "Guest User Registered" alert
    Then close the application

  @TC0011_student_register
  Scenario: TC_0011 User enters an invalid SSN - Negative Test
    Given User is on registration page
    When User enters name
    And name must contain any character and cannot be left blank
    And User enters surname
    And Surname must contain any character and cannot be left blank
    And User enters their birth place
    And Birth place must contain any character and cannot be left blank
    And User enters their phone number
    And User selects their gender
    And User enters their date of birth
    And User enters an invalid SSN
    And User enters User Name
    And User enters their password
    And Password must consist of at least 8 characters
    And Password must contain at least one uppercase letter, one lowercase letter and one digit
    And User clicks on register button
    Then User should not see "Guest User Registered" alert
    Then close the application

  @TC0012_student_register
  Scenario: TC_0012 User enters an empty username - Negative Test
    Given User is on registration page
    When User enters name
    And name must contain any character and cannot be left blank
    And User enters surname
    And Surname must contain any character and cannot be left blank
    And User enters their birth place
    And Birth place must contain any character and cannot be left blank
    And User enters their phone number
    And User selects their gender
    And User enters their date of birth
    And User enters SSN
    And SSN; must contain ‘-’ after the 3rd and 5th digits and consist of 9 digits
    And User enters an empty username
    And User should see "Required"alert
    Then close the application

  @TC0013_student_register
  Scenario: TC_0013 User enters a password with less than 8 characters - Negative Test
    Given User is on registration page
    When User enters name
    And name must contain any character and cannot be left blank
    And User enters surname
    And Surname must contain any character and cannot be left blank
    And User enters their birth place
    And Birth place must contain any character and cannot be left blank
    And User enters their phone number
    And User selects their gender
    And User enters their date of birth
    And User enters SSN
    And SSN; must contain ‘-’ after the 3rd and 5th digits and consist of 9 digits
    And User enters User Name
    And User enters a password with less than 8 characters
    And User clicks on register button
    Then User should not see "Guest User Registered" alert
    Then close the application

  @TC0014_student_register
  Scenario: TC_0014 User enters a password without an uppercase letter - Negative Test
    Given User is on registration page
    When User enters name
    And name must contain any character and cannot be left blank
    And User enters surname
    And Surname must contain any character and cannot be left blank
    And User enters their birth place
    And Birth place must contain any character and cannot be left blank
    And User enters their phone number
    And User selects their gender
    And User enters their date of birth
    And User enters SSN
    And SSN; must contain ‘-’ after the 3rd and 5th digits and consist of 9 digits
    And User enters User Name
    And Password must consist of at least 8 characters
    And User enters a password without an uppercase letter
    And User clicks on register button
    Then User should not see "Guest User Registered" alert
    Then close the application

  @TC0015_student_register
  Scenario: TC_0015 User enters a password without a lowercase letter - Negative Test
    Given User is on registration page
    When User enters name
    And name must contain any character and cannot be left blank
    And User enters surname
    And Surname must contain any character and cannot be left blank
    And User enters their birth place
    And Birth place must contain any character and cannot be left blank
    And User enters their phone number
    And User selects their gender
    And User enters their date of birth
    And User enters SSN
    And SSN; must contain ‘-’ after the 3rd and 5th digits and consist of 9 digits
    And User enters User Name
    And Password must consist of at least 8 characters
    And User enters a password without a lowercase letter
    And User clicks on register button
    Then User should not see "Guest User Registered" alert
    Then close the application

  @TC0016_student_register
  Scenario: TC_0016 User enters a password without a digit - Negative Test
    Given User is on registration page
    When User enters name
    And name must contain any character and cannot be left blank
    And User enters surname
    And Surname must contain any character and cannot be left blank
    And User enters their birth place
    And Birth place must contain any character and cannot be left blank
    And User enters their phone number
    And User selects their gender
    And User enters their date of birth
    And User enters SSN
    And SSN; must contain ‘-’ after the 3rd and 5th digits and consist of 9 digits
    And User enters User Name
    And Password must consist of at least 8 characters
    And User enters a password without a digit
    And User clicks on register button
    Then User should not see "Guest User Registered" alert
    Then close the application

  @TC0017_student_register
  Scenario: TC_0017 User enters a password only with digits - Negative Test
    Given User is on registration page
    When User enters name
    And name must contain any character and cannot be left blank
    And User enters surname
    And Surname must contain any character and cannot be left blank
    And User enters their birth place
    And Birth place must contain any character and cannot be left blank
    And User enters their phone number
    And User selects their gender
    And User enters their date of birth
    And User enters SSN
    And SSN; must contain ‘-’ after the 3rd and 5th digits and consist of 9 digits
    And User enters User Name
    And Password must consist of at least 8 characters
    And User enters a password only with digits
    And User clicks on register button
    Then User should not see "Guest User Registered" alert
    Then close the application
