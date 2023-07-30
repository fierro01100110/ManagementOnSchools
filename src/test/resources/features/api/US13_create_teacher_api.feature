@US13_Api @Api @smokeTest
Feature: Vice Deans should be able to create a teacher.

  Scenario Outline: US13_GetTeacherByUsername

    Given send the get request by "<username>"
    Then body should contain that birth_day "<birth_day>", birth_place "<birth_place>", gender "<gender>", name "<name>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>", username "<username>"
    Examples:
      | username | birth_day | birth_place | gender | name | phone_number | ssn | surname |
      | claraclara | 1995-07-10 | Montreal | 1 | Clara | 908-675-3412 | 345-44-3467 | David |
