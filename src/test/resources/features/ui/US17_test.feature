@e2e_us17 @smokeTest


@us17_ui_test
Feature: Teacher can enter the all student info on the Add Student Info form



  Scenario:Add student on the Student Info List
    Given user navigates to the url
    When user clicks on log in on home page
    And user enters a user name "gzmm"
    And user enters password "12345678"
    And user clicks on log in
   When user clicks on menu
    When user clicks on Student Info Management
    And user choose a lesson on Student Info Management
    And user choose a student name on Student Info Management
    And user choose a education term on Student Info Management
    And user enters absences on Student Info Management
    And user enters midterm exam on Student Info Management
    And user enters final exam on Student Info Management
    And user enters info note on Student Info Management
    And user clicks submit button on Student Info Management
    Then verify student info is visible on the student info list
    Then close the app

#  @us17_api_json_test
#
#  Scenario Outline: see all student's info (api)
#    Given get request by id for Student Info Management_json
#    Then body contain lesson "<lesson>", name "<name>",  term "<term>",  Absences "<Absences>", Midterm Exam "<Midterm Exam>", Final Exam "<Final Exam>", Info Note "<Info Note>", id "<id>" in Student Info Management_json
#    Examples:
#      | lesson | name          | term            | Absences | Midterm Exam | Final Exam | Info Note  | id  |
#      | ppppp  | Student Murat | SPRING_SEMESTER | 2        | 90.0         | 90.0       | successful | 930 |

  @US17_DB


  Scenario: Verify Student Info
    Given get all students info
    Then validate the body for Student Info







