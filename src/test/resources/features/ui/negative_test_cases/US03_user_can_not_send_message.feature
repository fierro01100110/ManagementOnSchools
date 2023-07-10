@e2e @negative_user_ui_test
Feature: US03_User_can_not_send_a_message

  Scenario Outline: user can not send a message from Contact page without entering a name

    Given user goes to "https://managementonschools.com"
    Given user clicks Contact button
    And user enters an email "<email>"
    And user enters a subject "<subject>"
    And user enters a message "<message>"
    And user clicks on Send Message button
    Then assert warning appears as warning
    And  close the app
    Examples:
      | name | email                   | subject  | message               |
      |      | andrey_test01@gmail.com | greeting | first message to dean |