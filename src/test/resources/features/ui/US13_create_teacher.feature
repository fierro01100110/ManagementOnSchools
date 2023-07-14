@US13_ui_test
Feature: US13_ViceDean_Should_Create_Teacher

  Background: Sign in as vice dean
    Given User goes to the url "https://managementonschools.com/"
    When  User clicks on Login
    And User enters "maria_jackson" in the User Name box
    And User enters "maria123" in the Password box
    And User clicks on Login button
    Then Verify the user successfully log in to vice dean account

  Scenario Outline: Create Teacher
    Given User clicks on Menu button
    Then User should be able to see Main Menu on the left side
    When User clicks on Teacher Management link
    And User selects a "<lesson>" in the Select lesson dropdown
    And User enters a "<name>" in the Name box
    And User enters a "<surname>" in the Surname box
    And User enters a "<birthPlace>" in the Birth Place box
    And User enters an "<email>" in the Email box
    And User enters "<phoneNumber>" in the Phone box
    And User selects on the Is Advisor Teacher checkbox if the teacher has an advisory role
    And User selects on the gender option checkbox
    And User enters "<dateOfBirth>" in the Date Of Birth box
    And User enters "<ssnNumber>" in the Ssn box
    And User enters "<username>" in the User Name Box
    And User enters "<password>" in the Password Box
    And User clicks on Submit button
    Then Verify the user sees the Teacher Saved Successfully message
    And Close the application
    Examples:
      | lesson | name    | surname   | birthPlace | email                 | phoneNumber  | dateOfBirth | ssnNumber   | username       | password  |
      | Java   | Jessica | Macdonald | New Jersey | jessica@macdonald.com | 123-456-4357 | 1997-01-28  | 456-78-1239 | jessicajessica | jes123Mac |
