@US14_API @Api
  Feature: Vice Dean should be able to see and update teachers(Api)

    Scenario Outline: US14_GetTeacherByUsername

      Given send get request by"<username>"
      Then body should contain  birth_place "<birth_place>", gender "<gender>", name "<name>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>", username "<username>"
      Examples:
        | username     | birth_day  | birth_place | gender | name  | phone_number | ssn         | surname      |
        | TeacherFehmi | 2001-03-27 | New York    | MALE   | Fehmi | 146-258-9866 | 889-99-6971 | TeacherFehmi |

   # @US14_API_Negative

   # Scenario: vice dean should be able to update information of teacher list
   #   Given get teacher by username "TeacherF ehmi"
   #   Then body should be empty

    #Scenario: vice dean should be able to update information of teacher list
     # Given get teacher by username "TeacherF ehmi"
      #Then body should be empty

