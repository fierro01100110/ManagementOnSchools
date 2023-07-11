@us_08
Feature: US08_Vice_Deans_Create_Lesson
  Background: TC01_Positive
    Given user goes to "https://managementonschools.com/"
    When user click on login
    And user enters username "AdminProject" and password "12345678"
    And user click on login button
    And user click on menu
    And user click on logout
    And user click on yes for logout
    And user enter username "Elya88" and password "Elya1988"
    And user click on login button

  Scenario: Create lesson
    Given user click on lessons
    When user enters lesson name "statics55"
    And user mark the course is compulsory
    And user enter credit score "9"
    And user click on submit button
    Then assert the alert
    And close the application