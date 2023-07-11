@database_test
Feature: Admins should be able to see, update and delete Deans information


  Scenario: Update Dean information by Admin
    Given update the Dean information via birthplace "<birthplace>"
    Then verify the birthplace is updated
