@US01_API @Api
Feature: Student Registration (API)

  Scenario: US01_GetGuestUserById

    Given send get request by username
    Then body should contain name, surname, birth_place, phone_number, gender, birth_day, ssn, username, password