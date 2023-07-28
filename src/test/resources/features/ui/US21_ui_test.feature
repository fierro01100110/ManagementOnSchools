@US21_ui_test
Feature: US21_Students_choose_lesson_grades_and_announcement

  Background: Sign in as a student
    Given Student goes to the url "https://managementonschools.com/"
    When  Student clicks on Login
    And Student enters username "evelinevelin" in the User Name box
    And Student enters password "evelin123" in the Password box
    And Student clicks on Login button
    Then Verify the student successfully log in to student account

  Scenario: Choose Lesson
    Given The student should be able to see the Teacher, Day, Start Time and Stop Time information in the Choose Lesson list
    Then The student should be able to select the desired lesson or lessons
    And The student should not be able to select lessons that coincide with the same day and time
    And The student should be able to delete a lesson they have selected
    And The student should be able to see the courses they have selected in the Lesson Program List
    And The student should be able to see their exam grades
    And The student should be able to see the meetings created by their advisor for them
    And Close the application for student