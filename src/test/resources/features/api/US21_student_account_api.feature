@US21_Api @Api
Feature: Student should select and delete lesson.

  Scenario Outline: US21_GetStudentByUsername

    Given send the get request by student "<username>"
    Then body should contain those birth_day "<birth_day>", birth_place "<birth_place>", gender "<gender>", name "<name>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>", username "<username>"
    Examples:
      | username | birth_day | birth_place | gender | name | phone_number | ssn | surname |
      | evelinevelin | 2005-02-15 | New York | 1 | Evelin | 975-345-2233 | 897-45-1234 | Carillo |