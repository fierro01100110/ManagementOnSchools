@e2e @user_message_api_test
Feature: Update the Dean information

  Scenario:update the Dean information by Admin
    Given update the Dean information via birthplace "<birthplace>"
    Then verify the birthplace is updated
