@US06_DB
Feature: Deans should be able to create a Vice Dean account.

  Scenario Outline: US06_GetViceDean

    Given get vice dean via username "<username>"
    Then body contains birth_day "<birth_day>", birth_place "<birth_place>", gender "<gender>", name "<name>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>", username "<username>"
    Examples:
      | username      | birth_day  | birth_place | gender | name  | phone_number | ssn         | surname |
      | hasan.huseyin | 2020-01-01 | NYC         | 0      | hasan | 980-443-9393 | 545-78-0202 | huseyin |

  @US06_Negative
  Scenario: Admin should be able to delete information of Vice Dean List
      Given get vice dean via username "hasan.huseyinX"
      Then body must be empty

  @LoopExample
  Scenario: There must be at least 10 users whose birth_place is New York
      Given get vica dean via birth_place "birth_place"
      Then There must be at least 2 users




