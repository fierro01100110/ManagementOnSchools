@US02_API
  Feature: Admin should be able to see guest user list (Api)

    Scenario Outline: US02_GetGuestUserByUserName

      Given send get request by username "<username>"
      Then body should contain , name "<name>", ssn "<ssn>", username "<username>" phone_number "<phoneNumber>"

      Examples:

        | name | ssn         | username    | phoneNumber |
        | Dave | 868-67-6606 | lavern.kihn | 548-569-1727 |
