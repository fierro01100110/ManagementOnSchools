@US16_DB
Feature: vice dean should be able to view contact information's

  Scenario Outline: US16_GetContactInfo
    Given get contact message info via "<email>"
    Then body contains name "<name>", email "<email>", date "<date>", subject "<subject>", message "<message>"

    Examples:
      | name  | email                      | date       | subject | message                  |
      | Dunya | nereyegeldik@neredeyiz.com | 2023-07-30 | Konumuz | Nerereden Cikti Bu Mesaj |
