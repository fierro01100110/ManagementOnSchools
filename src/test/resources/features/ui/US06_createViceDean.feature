@create_vice_dean_account

Feature: Create Vice Dean Account

  Background:
    Given user navigates to login url
    When user login in as admin

  @positive_test
  Scenario: TC_01_admin_creates_vice_dean_account_test_positive

    Then Go to Menu button
    Then Click on Vice Dean Management
    Then Admin enters Vice Dean's Name
    Then Admin enters Vice Dean's Surname
    Then Admin enters Vice Dean's Birthplace
    Then Admin clicks on Gender
    Then Admin enters Vice Dean's Date Of Birth as "1990-01-01"
    Then Admin enters Vice Dean's Phone number
    Then Admin enters Vice Dean's SSN
    Then Admin enters Vice Dean's username (Cannot be left blank)
    Then Admin enters Vice Dean's password (Contains 8 character, uppercase, lowercase and number)
    Then Admin clicks on Submit button
    And Admin sees Vice Dean is registered
    And close the app

  @negative_test
  Scenario: TC_02_admin_creates_vice_dean_account_test_negative

    Then Go to Menu button
    Then Click on Vice Dean Management
    Then Admin enters Vice Dean's Name
    Then Admin enters Vice Dean's Surname
    Then Admin enters Vice Dean's Birthplace
    Then Admin clicks on Gender
    Then Admin enters Vice Dean's Date Of Birth as "1990-01-01"
    Then Admin enters Vice Dean's Phone number
    Then Admin enters Vice Dean's SSN
    Then Admin enters Vice Dean's username (Cannot be left blank)
    Then Admin enters Vice Dean's password (Does not contain 8 character, uppercase, lowercase and number)
    Then Admin clicks on Submit button
    And close the app


