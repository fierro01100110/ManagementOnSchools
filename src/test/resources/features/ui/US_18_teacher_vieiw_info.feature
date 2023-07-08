@e2e @teacher_views_info_ui_test
Feature: US03_User_can_see_the_infolist_of_students

Background:log in as a teacher
  Given user goes to "https://managementonschools.com"
  And user logs in as a teacher

  Scenario:TC_001 view the student info list as a teacher
    Then assert that user sees the student info list


Scenario Outline: TC_002 update student grade as a teacher
    When user clicks Edit button
  And user selects lesson
  And user select Education Term
  And user upgrades Absentee "<Absentee>"
  And user upgrades Midterm Exam "<Midterm Exam>"
  And user upgrades Final Exam "<Final Exam>"
  And user upgrades Info Note "<Info Note>"
  And user clicks Submit button
  Then assert the success message in upgrade

Examples: student info
  | Absentee | Midterm Exam | Final Exam | Info Note     |
  | 2        | 55           | 80         | good job well done|


  Scenario: TC_003 delete student info list as a teacher
    When user clicks delete button
    Then assert the success mesage in delete