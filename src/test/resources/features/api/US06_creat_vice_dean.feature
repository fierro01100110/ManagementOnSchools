@US06_API @Api
Feature: Deans should be able to create a Vice Dean account.

  Scenario Outline: US06_GetViceDeanByUsername

    Given send get request by username "<username>"
    And user enters a name "<name>"
    Then body should contain name "<name>", surname "<surname>",birth_place "<birth_place>",gender "<gender>",birth_day "<birth_day>",phone_number "<phone_number>",ssn "<ssn>",username "<username>"
    Examples:
      | username      | name  | surname | birth_place | gender | birth_day  | phone_number | ssn         |
      | hasan.huseyin | hasan | huseyin | NYC         | MALE   | 2020-01-01 | 980-443-9393 | 545-78-0202 |

    @US06_NegativeApi0
    Scenario: Dean should be able to delete information of Vice Dean
      Given send get request by "hasan.huseyinX"
      Then body must be empty with non existing username "hasan.huseyinX"

