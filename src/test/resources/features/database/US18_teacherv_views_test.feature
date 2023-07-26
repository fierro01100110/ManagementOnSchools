
@US18_DB_old
Feature: The teacher should be able to view and update the grades given to the student.(Student Info List)
#   NAME, LESSON_NAME ARE NOT CREATED BY DEVELOPER ITS A BUG
  @US18_DB_view
  Scenario Outline: US8_GetStudentList
    Given get student info via info_note "<info_note>"
    Then body contains name "<name>" lesson_name "<lesson_name>", absentee "<absentee>", midterm_exam "<midterm_exam>", final_exam "<final_exam>", note "<note>", info_note "<info_note>", exam_average "<exam_average>"

    Examples:
      |name           | lesson_name | absentee | midterm_exam | final_exam | note   | info_note              | exam_average |
      |student_andrey | Cypress       | 17       | 70           | 55         | CC   | try hard do your best  | 61           |


  @US18_DB_delete
  Scenario: TC02 Teacher should be able to delete information of student info list
    Given get student info via info_note "info_note"
    Then body should be empty

