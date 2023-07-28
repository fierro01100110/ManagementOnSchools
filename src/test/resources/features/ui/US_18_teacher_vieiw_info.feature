
@e2e @teacher_views_info_ui_test

@e2e @US18_teacher_views_info_ui_test

Feature: US18_User_can_see_the_infolist_of_students

Background:log in as a teacher
  Given user goes to "https://managementonschools.com"
  And user logs in as a teacher

@view_us18
  Scenario:TC_001 view the student info list as a teacher
    Then assert that user sees the student info list

@us_18_upgrade
Scenario Outline: TC_002 update student grade as a teacher
    When user clicks Edit button
  And user selects lesson
  And user select Education Term
  And user upgrades Absentee "<Absentee>"
  And user upgrades Midterm Exam "<Midterm_Exam>"
  And user upgrades Final Exam "<Final Exam>"
  And user upgrades Info Note "<Info_Note>"
  And user clicks Submit button
  Then assert the success message in upgrade

Examples: student info
  | Absentee | Midterm_Exam | Final Exam | Info_Note          |
  | 19        | 55           | 80         | good job well done |

  @delete
  Scenario: TC_003 delete student info list as a teacher
    When user clicks delete button
    Then assert the success message in delete
