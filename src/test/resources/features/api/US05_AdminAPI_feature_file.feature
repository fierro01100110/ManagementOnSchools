@US_05_api_test
Feature: Admins should be able to see, update and delete Deans information(ByAPI)

  Scenario Outline:  Update Dean information by Admin

    Given send get request by ssn "<ssn>"
    Then body should contain name "<name>", gender "<gender>", phoneNumber "<phoneNumber>", ssn "<ssn>", username"<username>"
    Examples:
      | name     | gender | phoneNumber  | ssn         | username       |
      | Terrence | MALE   | 431-799-8916 | 162-59-8030 | everette.olson |
