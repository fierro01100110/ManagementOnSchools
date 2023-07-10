@database_test
Feature: Admins should be able to see, update and delete Deans information

  @test_case_001
  Scenario: Verify given Dean information by Admin
    Given connect to database
    Then verify that Admin able to see Deans Information

  @test_case_002
  Scenario: Update Dean information by Admin
    Given get the

  @test_case_003
  Scenario: Delete Dean information by Admin
    Given get the Dean Information
    And Delete the Dean from the list.