@US09_Api
Feature: Vice Dean should be able to view the Lesson Name, Compulsory and Credit Score created(Api)

  Scenario Outline: US09_GetLesson_Information

    Given send get request by lesson_name "<lesson_name>"
    Then body should contain lesson_name "<lesson_name>" ,compulsory "<compulsory>", credit_score "<credit_score>"
    Examples:
      | lesson_name | compulsory | credit_score |
      | Electronic  | true       | 40           |


  Scenario: Admin should be able to delete lesson information
    Given send get request by lesson_name "Electronic"
    Then body must be empty with non existing lesson_name "ElectronicX"