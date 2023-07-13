@admin_added_dean
Feature: Admin added dean

  Background:
    Given user goes to url
    Then user logs in as admin


  Scenario: TC_001 admin can add dean
    Given admin clicks on menu button
    When admin clicks to dean management
    Then verify admin is able see submit button
    And admin enters dean name
    And admin enters dean surname
    And admin enters dean birthplace
    And admin clicks on gender male
    And admin enters dean birthday
    And admin enters dean phone number
    And admin enters dean ssn
    And admin enters dean username
    And admin enters dean password
    And admin clicks on submit button
    And admin sees dean saved



