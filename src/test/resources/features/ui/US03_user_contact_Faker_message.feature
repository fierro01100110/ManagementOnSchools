@e2e @us03_user_ui_test
Feature: US03_User_can_send_a_message

  Scenario: send a message from Contact page

    Given user goes to home page "https://managementonschools.com"
    Given user clicks Contact button
    And user enters a fakeName
    And user enters an fakeEmail
    And user enters a fakeSubject
    And user enters a fakeMessage
    And user clicks on Send Message button
    Then assert alert message on contact page
    And  close the app
