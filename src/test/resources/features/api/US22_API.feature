@US22_API
Feature: User adds admin

  Scenario Outline: US22_Verify admins
    Given user sends get request by admin "admin", getAll "getAll" and page "0", size "1000", sort "name", type "desc"
    Then the body should contain name "<name>", surname "<surname>", gender "<gender>", phoneNumber "<phoneNumber>", ssn "<ssn>", username "<username>"
    Examples:
      | name   | surname | gender | phoneNumber  | ssn         | username      |
      | Nursah | Akcin   | FEMALE | 685-555-4222 | 123-55-8526 | acayipbirisii |