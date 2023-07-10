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
    And admin clicks on last page of dean list
    And admin sees dean Hakan on dean list

  Scenario: TC_002 admin cannot be able to add dean
    Given admin navigates to menu
    When admin clicks to dean management
    Then verify admin is able see submit button
    And admin enters dean name as blank
    And admin enters dean surname as blank
    And admin enters dean birthplace as blank
    And admin clicks on gender as blank
    And admin enters dean date of birth as blank
    And admin enters dean phone number as blank
    And admin enters dean ssn as blank
    And enters dean username as blank
    And admin enters dean password as blank
    And admin clicks on submit button
    And admin cannot see dean is registered


