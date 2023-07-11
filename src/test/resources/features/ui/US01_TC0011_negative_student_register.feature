@TC0011_student_register @US01_NegativeTest

Feature: Student Registration

  Background:
    Given user navigates to url
    Then user clicks on register

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
    Then Register button should not be clickable
    Then close the application