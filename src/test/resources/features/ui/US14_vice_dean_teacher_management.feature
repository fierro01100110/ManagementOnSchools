@vice_dean_teacher_management
  Feature: Vice Dean teacher management

    Background:
      Given go to url
      Then user log in as vice dean
      Then user clicks on the menu button

    @teacher_management
    Scenario:TC_001 Vice Dean should be able to see information of the created teachers
      Given vice dean clicks on the teacher management
      Then verify vice dean is able to see teacher management page

    @teacher_management_edit
    Scenario: TC_002 Vice Dean should be able to update teachers information in the 'Teacher List'
      Given vice dean clicks on the teacher management
      Then verify vice dean is able to see the teacher information in the teacher list
      And click on the edit button
      Then verify vice dean is able to see the teacher information in the edit page
      And click on the choose lesson box to "select lesson"
      And click on the name box to update "name"
      And click on the surname  box to update "surname"
      And click on the birth place  box to update "birth place"
      And click on the e-mail  box to update "e-mail"
      And click on the phone  box to update "phone" number
      And click on the ssn  box to update "ssn" number
      And select the "is advisor" teacher option
      And select the gender option to update "gender"
      And click on the date of birth  box to update "date of birth"
      And click on the user name  box to update "user name"
      And click on the password  box to update "password"
      And click on the "submit" button
      Then verify that the teacher updated successful message is displayed




