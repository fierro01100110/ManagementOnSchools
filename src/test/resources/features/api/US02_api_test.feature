@US02_API
Feature: Admin should be able to see guest user list (Api)

  Scenario Outline: US02_GetGuestUserByUserName

    Given send get request by username for guest user
    Then body should contain , name "<name>", ssn "<ssn>", username "<username>" phone_number "<phoneNumber>"

    Examples:


      | name | ssn         | username | phoneNumber  |
      | Amee | 845-03-3414 | Jamal    | 965 146 8851 |
      |      |             |          |              |
      |      |             |          |              |

