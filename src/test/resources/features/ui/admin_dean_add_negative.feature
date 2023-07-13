@admin_added_dean_negative
Feature: Admin added dean negative

  Background:
    Given user goes to url
    Then user logs in as admin


Scenario: TC_001 admin cannot be able to add dean
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