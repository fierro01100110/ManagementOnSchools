@US24_api_test
  Feature: Verify the added teacher

Scenario Outline: Admin should be able to see new teacher's information
Given send get request by userId "<userId>"
Then body must contain userId "<userId>", name "<name>", surname "<surname>", birthPlace "<birthPlace>", email "<email>", phoneNumber "<phoneNumber>", gender "<gender>", birthDay "<birthDay>", ssn "<ssn>", username "<username>", message"<message>"
And close the application
  Examples:
    | userId | name | surname | birthPlace | email             | phoneNumber  | gender | birthDay   | ssn         | username    | message                    |
    | 31     | sefa | sefa    | turkey     | sefasefa@sefa.com | 555-111-9900 | MALE   | 1990-12-12 | 555-12-1234 | TeacherSefa | Teacher successfully found |
