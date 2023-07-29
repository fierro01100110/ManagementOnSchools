@e2e @us03_user_message_api_test
Feature: Users should be able to send messages from the page(Contact)



  Scenario Outline: US01_GetUserMessageByEmail

    Given send get request by email "<email>"
    Then body should contain name "<name>", subject "<subject>", message "<message>",email "<email>"
    Examples:
      | email                    | name   | subject                  | message                                              |
      | andreytest0102@gmail.com | Andrey | greeting and information | hi mr dean i would like to know my final exam result |


