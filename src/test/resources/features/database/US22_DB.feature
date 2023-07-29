@US22_DB
Feature: verify Admin

  Scenario Outline: US22_Admin verification
    Given get admin by username "<username>"
    Then the body will contain name "<name>", surname "<surname>", gender "<gender>", phoneNumber "<phoneNumber>", ssn "<ssn>"
    Examples:
      | username      | name   | surname | gender | phoneNumber  | ssn         |  |
      | acayipbirisii | Nursah | Akcin   | 1      | 685-555-4222 | 123-55-8526 |  |