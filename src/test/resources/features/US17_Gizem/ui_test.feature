@us17_ui_test
Feature: Teacher can enter the all student info on the Add Student Info form

  Background:Sign in as a teacher
    Given user navigates to the url
    When user clicks on log in on home page
    And user enters a user name "gzmm"
    And user enters password "12345678"
    And user clicks on log in


  Scenario Outline: Add student on the Student Info List
    Given user clicks on menu
    When user clicks on Student Info Management
    And user choose a lesson "<lesson>"
    And user choose a student name "<name>"
    And user choose a education term "<term>"
    And user enters absences "<Absences>"
    And user enters midterm exam "<Midterm Exam>"
    And user enters final exam "<Final Exam>"
    And user enters info note "<Info Note>"
    And user clicks submit button
    Then verify student info is visible on the student info list
    Then close the app


    Examples:
      | lesson | name          | term           | Absences | Midterm Exam | Final Exam | Info Note  |
      | java   | Student Murat | SPRING_SEMESTR | 2        | 90           | 90         | successful |

