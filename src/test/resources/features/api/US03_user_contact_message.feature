@e2e @user_message_api_test
Feature: Get the message created and validate

  Scenario: Send get request do assertion
    Given send the request
    Then validate the body