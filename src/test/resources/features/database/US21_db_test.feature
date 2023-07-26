@US21_DB
Feature: Student should select and delete lesson.

  Scenario Outline: US21_GetStudent

    Given get student information via username "<username>"
    Then body contains those birth_day "<birth_day>", birth_place "<birth_place>", gender "<gender>", name "<name>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>", username "<username>", email "<email>"
    Examples:
      | username | birth_day | birth_place | gender | name | phone_number | ssn | surname | email |
      | evelinevelin | 2005-02-15 | New York | 1 | Evelin | 975-345-2233 | 897-45-1234 | Carillo | evelin@carillo.com |

  @US21_Negative
  Scenario: Student should be able to delete information of student list.
    Given get student information via username "evelinevelinX"
    Then body should be empty student list
