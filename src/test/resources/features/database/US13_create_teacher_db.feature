@US13_DB
Feature: Vice Deans should be able to create a teacher.

  Scenario Outline: US13_GetTeacher

    Given get teacher information via username "<username>"
    Then body contains that birth_day "<birth_day>", birth_place "<birth_place>", gender "<gender>", name "<name>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>", username "<username>", email "<email>", is_advisor "<is_advisor>"
    Examples:
      | username       | birth_day  | birth_place | gender | name    | phone_number | ssn         | surname   | email                 | is_advisor |
      | jessicajessica | 1997-01-28 | New Jersey  | 1      | Jessica | 123-456-4357 | 456-78-1239 | Macdonald | jessica@macdonald.com | f          |

  @US13_Negative
  Scenario: ViceDean should be able to delete information of teacher List.
    Given get teacher information via username "jessicajessicaX"
    Then body should be empty list

