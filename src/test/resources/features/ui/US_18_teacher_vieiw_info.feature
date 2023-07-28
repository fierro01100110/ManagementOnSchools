@e2e @US18_teacher_views_info_ui_test
Feature: US18_User_can_see_the_infolist_of_students

Background:log in as a teacher
  Given user goes to "https://managementonschools.com"
  And user logs in as a teacher

@view_us18
  Scenario:TC_001 view the student info list as a teacher
    Then assert that user sees the student info list


  @delete
  Scenario: TC_003 delete student info list as a teacher
    When user clicks delete button
    Then assert the success message in delete
