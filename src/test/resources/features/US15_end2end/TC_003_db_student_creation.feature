@vice_dean_student_creation



Feature: Verify Student Creation on DataBase

  Scenario: TC_003 verify student creation
    Given send get request by student username
    Then validate the student body creation by birth_place, name, phone_number, ssn, username, email, father_name, mother_name