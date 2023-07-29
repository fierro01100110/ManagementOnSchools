@US16_Api
Feature: vice dean should be able to see the messages
  Scenario Outline: US16_GetContactGetAll
    Given sends get request by "<email>"
    Then body should contain name "<name>", email "<email>", date "<date>", subject "<subject>", message "<message>"
   Examples:
     | name  | email                      | date       | subject | message                  |
     | Dunya | nereyegeldik@neredeyiz.com | 2023-07-30 | Konumuz | Nerereden Cikti Bu Mesaj |



  #@US16_NegativeApi
  #Scenario: vice dean should be able to delete
  #Given send get request by "nnereyegeldik@neredeyiz.com"
  # Then body must be empty with non existing email "nereyegeldik@neredeyiz.com"
