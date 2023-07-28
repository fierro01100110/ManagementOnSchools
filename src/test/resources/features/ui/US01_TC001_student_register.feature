@SMOKE @US01_UI @TC001_student_register @e2e @apiui  @uidb

Feature: Student Registration

  Background:
    Given user navigates to url
    Then user clicks on register

    Scenario: UI US01_Student Registration
      Given User is on registration page
      When User enters name
      And name must contain any character and cannot be left blank
      And User enters surname
      And Surname must contain any character and cannot be left blank
      And User enters their birth place
      And Birth place must contain any character and cannot be left blank
      And User enters their phone number
      And User selects their gender
      And User enters their date of birth
      And User enters SSN
      And SSN; must contain ‘-’ after the 3rd and 5th digits and consist of 9 digits
      And User enters User Name
      And User enters their password
      And Password must consist of at least 8 characters
      And Password must contain at least one uppercase letter, one lowercase letter and one digit
      And User clicks on register button
      Then User should see "Guest User Registered" alert
      Then close the application


#  @US01_API @TC001_student_register @e2e @apiui
#  Feature: API Student Registration
  @US01_API
  Scenario: API US01_Student Registration

    Given send get request by username
    Then body should contain name, surname, birth_place, phone_number, gender, birth_day, ssn, username, password

#  @US01_DB @TC001_student_register @e2e

#  Feature: Database - Prospective students should be able to register in the system.
  Scenario: DB US01_Student Registration

    Given get guest user with username "username"
    Then body contains name "fakeName", surname "fakeSurname", birth_place "fakeBirth_place", phone_number "fakePhone", gender "fakeGender", birth_day "fakeBirth_day", ssn "fakeSSN", username "fakeUsername"





