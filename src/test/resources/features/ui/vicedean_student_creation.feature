@vice_dean_student_creation
Feature: Vice Deans should be able to create a student

  Background:
    Given user navigates to url
    Then user logins as vice dean

    Scenario: Vice Deans should be able to create a student
      Given vice dean navigates to menu
      Then vice dean clicks to student management
      And choose advisor teacher
      And enter name
      And enter surname
      And enter birth place
      And enter email
      And enter phone number
      And select gender
      And select date of birth
      And enter SSN respecting "-" after the 3rd and 5th digits and consist of 9 digits in total
      And enter user name
      And enter father name
      And enter mother name
      And enter password respecting password credentials
      And verify student number automatically appear after submitting
