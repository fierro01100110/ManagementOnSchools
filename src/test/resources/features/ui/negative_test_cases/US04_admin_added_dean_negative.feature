@admin_added_dean_negative
Feature: Admin added dean negative

  Background:
    Given user enter to url
    Then user sign in as admin


Scenario: TC_002 admin cannot be able to add dean
Given admin clicks on the menu button
When admin clicks to the dean management
And admin enters dean name as blank
And admin enters dean surname as blank
And admin enters dean birthplace as blank
And admin enters dean date of birth as blank
And admin enters dean phone number as blank
And admin enters dean ssn as blank
And admin enters dean username as blank
And admin enters dean password as blank
