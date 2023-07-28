@US24_api_test
Feature: Verify the added teacher

  Scenario: Admin should be able to see new teacher's information
    Given send the get request by userId
    Then assert the body after added the new teacher
    And close the application
