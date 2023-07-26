@US22_API
Feature: User adds admin

  Scenario Outline: US22_Verify admins
    Given user sends get request by admin "admin", getAll "getAll" and page "0", size "10", sort "name", type "desc"
    Then the body should contain name "<name>", gender "<gender>", phoneNumber "<phoneNumber>", ssn "<ssn>", username "<username>"
    Examples:
      | name  | gender | phoneNumber  | ssn         | username |
      | AHMET | SAHIN  | 432-567-1253 | 134-32-6753 |Team051   |