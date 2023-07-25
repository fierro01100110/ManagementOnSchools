@us17_api_test

  Feature: all student info on the Add Student Info form exists.
    Scenario Outline: see all student info (api)
      Given get request by id
      Then body contain "<lesson>", "<name>", "<term>", "<Absences>","<Midterm Exam>", "<Final Exam>", "<Info Note>"
      Examples:
        | lesson | name          | term            | Absences | Midterm Exam | Final Exam | Info Note  |
        | Java   | Student Murat | SPRING_SEMESTER | 2        | 90           | 90         | successful |


