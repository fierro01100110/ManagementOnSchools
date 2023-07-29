@US23_DB
Feature: Admin should be able to create a Vice Dean account.

  Scenario Outline: US23_GetViceDean

    Given get vice dean via username orhan db "<username>"
    Then body contains birth_day orhan db "<birth_day>", birth_place "<birth_place>", gender "<gender>", name "<name>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>", username "<username>"
    Examples:
      | username      | birth_day  | birth_place | gender | name  | phone_number | ssn         | surname |
      | kasim.aydemir | 1992-01-01 | FL          | 0      | KASIM | 783-570-0743 | 783-57-0743 | AYDEMIR |

  @US06_Negative
  Scenario: Admin should be able to delete information of Vice Dean List
    Given get vice dean via username orhan db "kasim.aydemirX"
    Then body must be empty orhan db

  @LoopExample
  Scenario: There must be at least 10 users whose birth_place is New York
    Given get vica dean via birth_place orhan db "birth_place"
    Then There must be at least 2 users orhan db




