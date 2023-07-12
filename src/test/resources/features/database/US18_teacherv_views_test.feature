
@US18_DB
Feature: The teacher should be able to view and update the grades given to the student.(Student Info List)

  Scenario Outline: US8_GetStudentList
    Given get student info via id "<id>"
    Then body contains lesson_name "<lesson_name>", absentee "<absentee>", midterm "<midterm>", final "<final>", note "<note>", info_note "<info_note>", average "<average>"

    Examples:
      | od | lesson_name | absentee | midterm | final | note | info_note | average |
      | 2  | Java        | 19       | 70      | 60    | BB   | GOOD JOB  | 64      |


  @US18_Negative
  Scenario: teacher should be able to delete information of Guest User List
    Given get guest user via username "john_doeX"
    Then body should be empty

