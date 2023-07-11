@TC0017_student_register @US01_NegativeTest

Feature: Student Registration

  Background:
    Given user navigates to url
    Then user clicks on register

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
    Then Register button should not be clickable
    Then close the application
