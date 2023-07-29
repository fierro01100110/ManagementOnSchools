@vice_dean_lesson_schedule
Feature: Vice Dean creates lesson schedule
  Background:
    Given user navigates to url
    And user clicks on Login on homepage
    Then user logs in as vice dean by entering username "Seymayazan" and password "12345678"
    And user clicks on login button


    @TC_001_US10
    Scenario: TC_001 Vice Dean should be able to create a lesson schedule
      Given user clicks on Menu
      And user selects Lesson Management from the menu
      And user selects Lesson Program Management
      And user selects a lesson from Choose Lessons
      And user selects a semester
      And user selects a day from Choose Day
      And user selects Start Time
      And user selects Stop Time
      When user clicks on Submit button
      Then user sees Created lesson program success message


      @TC_002
      Scenario: TC_002 Vice Dean should not be able to create a lesson schedule without selecting a day
        Given user clicks on Menu
        And user selects Lesson Management from the menu
        And user selects Lesson Program Management
        And user selects a lesson from Choose Lessons
        And user selects a semester
        And user selects Start Time
        And user selects Stop Time
        When user clicks on Submit button
        Then Verify that new lesson program can not be created


        @TC_003
        Scenario: TC_003 Vice Dean should not be able to create a lesson schedule without selecting a lesson
          Given user clicks on Menu
          And user selects Lesson Management from the menu
          And user selects Lesson Program Management
          And user selects a semester
          And user selects a day from Choose Day
          And user selects Start Time
          And user selects Stop Time
          When user clicks on Submit button
          Then Verify that new lesson can't be created due to lesson section







