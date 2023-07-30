@Admin_creates_vice_dean_account @smokeTest

Feature: Admin Create Vice Dean Account

  Background:
    Given user Admin should navigates to login url
    When user Admin should login in as admin

  Scenario: TC_01

    Then Admin Go to Menu button
    Then Admin Click on Vice Dean Management
    Then Admin should enter Vice Dean's Name
    Then Admin should enters Vice Dean's Surname
    Then Admin should enters Vice Dean's Birthplace
    Then Admin should clicks on Gender
    Then Admin should enters Vice Dean's Date Of Birth as "1990-01-01"
    Then Admin should enters Vice Dean's Phone number
    Then Admin should enters Vice Dean's SSN
    Then Admin should enters Vice Dean's username (Cannot be left blank)
    Then Admin should enters Vice Dean's password (Contains 8 character, uppercase, lowercase and number)
    Then Admin should clicks on Submit button
    And Admin should sees Vice Dean is registered
    And should close the applications

  @negative_test_US23
  Scenario: TC_02

    Then Admin Go to Menu button
    Then Admin Click on Vice Dean Management
    Then Admin should enter Vice Dean's Name
    Then Admin should enters Vice Dean's Surname and left blank
    Then Admin should enters Vice Dean's Birthplace
    Then Admin should clicks on Gender
    Then Admin should enters Vice Dean's Date Of Birth as "1990-01-01"
    Then Admin should enters Vice Dean's Phone number
    Then Admin should enters Vice Dean's SSN
    Then Admin should enters Vice Dean's username (Cannot be left blank)
    Then Admin should enters Vice Dean's password (Contains 8 character, uppercase, lowercase and number)
    Then Admin should clicks on Submit button
    And Admin should sees Vice Dean is registered
    And should close the applications






