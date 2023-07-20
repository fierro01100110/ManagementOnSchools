@e2e @US18_API
Feature: The teacher should be able to view and update the grades given to the student.(Student Info List)

  Scenario Outline: US18_Api view the grades

    Given send get request by email "<email>"
    Then body should contain name "<name>", subject "<subject>", message "<message>",email "<email>"
    Examples:
      | email                    | name      | subject                  | message                                              |
      | andreytest0102@gmail.com | as Kilinc | greeting and information | hi mr dean i would like to know my final exam result |
