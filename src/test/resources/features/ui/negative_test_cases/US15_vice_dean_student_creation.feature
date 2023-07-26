@negative_vice_dean_student_creation

Feature: Vice Deans shouldn't be able to create a student leaving field blank

Background:
Given user navigates to url
Then user logins as malcom_vice dean

  @negative1_vice_dean_student_creation
Scenario: TC_001 Vice Deans shouldn't be able to create a student leaving name blank
Given vice dean navigates to menu
Then vice dean clicks to student management
And choose advisor teacher
And vice dean does not enter a name
And enter surname
And enter birth place
And enter email
And enter phone number
And select gender
And select date of birth
And enter SSN respecting - after the 3rd and 5th digits and consist of 9 digits in total
And enter user name
And enter father name
And enter mother name
And enter password respecting password credentials
And verify name required after submitting




    @negative2_vice_dean_student_creation
  Scenario: TC_002 Vice Deans should be able to create a student with wrong SSN credentials
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
    And vice dean is not entering SSN respecting - after the third and fifth digits and consist of nine digits in total
    And enter user name
    And enter father name
    And enter mother name
    And enter password respecting password credentials
      And verify SSN pop-up after submitting



  @negative3_vice_dean_student_creation
  Scenario: TC_003 Vice Deans shouldn't be able to create a student leaving user name blank
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
    And enter SSN respecting - after the 3rd and 5th digits and consist of 9 digits in total
    And vice dean is not entering user name
    And enter father name
    And enter mother name
    And enter password respecting password credentials
    And verify user name required after submitting
