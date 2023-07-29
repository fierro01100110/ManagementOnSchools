@US23_API
Feature: Admin should be able to create a Vice Dean account.

  Scenario Outline: US23_GetViceDeanByUsername

    Given us23 should send get request by orhan "<username>"
    Then us23 body should contain name "<name>", surname "<surname>",birth_place "<birth_place>",gender "<gender>",birth_day "<birth_day>",phone_number "<phone_number>",ssn "<ssn>",username "<username>"
    Examples:
      | username      | name  | surname | birth_place | gender | birth_day  | phone_number | ssn         |
      | kasim.aydemir | KASIM | AYDEMIR | FL          | MALE   | 1992-01-01 | 783-570-0743 | 783-57-0743 |

  @US23_NegativeApi
  Scenario: My Admin should be able to delete information of Vice Dean
    Given us23 should send get request by orhan "kasim.aydemir"
    Then US twenty three body must be empty with non existing username "kasim.aydemirX"


