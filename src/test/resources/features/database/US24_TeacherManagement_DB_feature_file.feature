@US_24_database_test
  Feature: Verify the added teacher

Scenario Outline: Admin should be able to see new teacher's information
Given send get request via id "<id>"
Then body must contain id "<id>", name "<name>", surname "<surname>", birth_place "<birth_place>", email "<email>", phone_number "<phone_number>", gender "<gender>", birth_day "<birth_day>", ssn "<ssn>", username "<username>", message"<message>"
And close the application
  Examples:
    | id | name | surname | birth_place | email             | phone_number | gender | birth_day  | ssn         | username    | message                    |
    | 31 | sefa | sefa    | turkey      | sefasefa@sefa.com | 555-111-9900 | 0      | 1990-12-12 | 555-12-1234 | TeacherSefa | Teacher successfully found |
