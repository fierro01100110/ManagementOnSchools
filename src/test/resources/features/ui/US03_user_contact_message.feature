@e2e @US03_user_ui_test
Feature: US03_User_can_send_a_message

  Scenario Outline: send a message from Contact page

    Given user goes to home page "https://managementonschools.com"
    Given user clicks Contact button
    And user enters a name "<name>"
    And user enters an email "<email>"
    And user enters a subject "<subject>"
    And user enters a message "<message>"
    And user clicks on Send Message button
    Then assert alert message on contact page
    And  close the app
    Examples:
      | name   | email                   | subject  | message               |
      | andrey | andrey_test01@gmail.com | greeting | first message to dean |
