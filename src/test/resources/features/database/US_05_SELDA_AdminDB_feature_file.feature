@US_05_database_test
Feature: Admins should be able to see, update and delete Deans information

  Scenario Outline:  US05_Update Dean information

    Given send get request via "<ssn>"
    Then body contains name "<name>", gender "<gender>", phone_number "<phone_number>", ssn "<ssn>", username"<username>"
    Examples:
      | name     | gender | phone_number | ssn         | username       |
      | Terrence | 0      | 431-799-8916 | 162-59-8030 | everette.olson |