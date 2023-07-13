@e2e @invalid_email_user_ui_test
Feature: US03_User_can_not_send_a_message_without_@_symbol

  Scenario Outline: user can not send a message from Contact page without @ symbol

    Given user goes to "https://managementonschools.com"
    Given user clicks Contact button
    And user enters a name "<name>"
    And user enters an invalid email "<email>"
    And user enters a subject "<subject>"
    And user enters a message "<message>"
    And user clicks on Send Message button
    Then assert invalid email error message
    And  close the app
    Examples:
      | name   | email | subject  | message               |
      | andrey | and   | greeting | first message to dean |