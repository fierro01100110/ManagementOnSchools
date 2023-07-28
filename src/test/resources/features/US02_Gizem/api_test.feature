@US02_API
Feature: Admin should be able to see guest user list (Api)

  Scenario Outline: US02_GetGuestUserByUserName

<<<<<<< HEAD
      Given send get request by username "<username>"
      Then body should contain , name "<name>", ssn "<ssn>", username "<username>" phone_number "<phoneNumber>"
=======
    Given send get request by username for guest user

    Then body should contain , name "<name>", ssn "<ssn>", username "<username>" phone_number "<phoneNumber>"

    Examples:


      | name | ssn         | username | phoneNumber  |
      | Amee | 845-03-3414 | Jamal    | 965 146 8851 |
>>>>>>> 8839d85aeea3dcf0c6f2e723721994dee2225625


