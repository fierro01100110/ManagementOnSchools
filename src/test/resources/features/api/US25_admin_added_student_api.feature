@US25_admin_added_student_api @Api
Feature: Admin added student api

  Scenario Outline: TC_001 admin can add student


    Given send get request student Hakan by "<username>"
    Then body should contain Hakan userId "<userId>", username "<username>", name "<name>", surname "<surname>", birthDay "<birthDay>", birthPlace "<birthPlace>", phoneNumber "<phoneNumber>", gender "<gender>", motherName "<motherName>", fatherName "<fatherName>", email "<email>"
    Examples:
      | userId | username | name  | surname  | birthDay   | birthPlace | phoneNumber  | gender | motherName | fatherName | email         |
      | 1255   | hsnhoca  | Hasan | Hocaoglu | 1995-10-10 | Edmonton   | 333-999-8888 | MALE   | Fatma      | Mehmet     | hsn@gmail.com |


  #"username": "hsnhoca",
  #"advisorTeacher": "murat"
  #"name": "Hasan",
  #"surname": "Hocaoglu",
  #"birthPlace": "Edmonton",
  #"email": "hsn@gmail.com",
  #"phoneNumber": "333-999-8888",
  #"gender": "MALE"
  #"birthDay": "1995-10-10",
  #"ssn": "333-11-4444",
  #"fatherName": "Mehmet",
  #"motherName": "Fatma",
  #"password": "87654321",


