@US01_DB
Feature: Prospective students should be able to register in the system.

  Scenario: US01_GetGuestUser

    Given get guest user with username "<username>"
    Then body contains name, "<name>", surname, "<surname>", birth_place, "<birth_place>", phone_number, "<phone_number>", gender, "<gender>", birth_day, "<birth_day>", ssn, "<ssn>", username,"<username>"


