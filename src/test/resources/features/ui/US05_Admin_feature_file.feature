@US_05
Feature: Admins should be able to see, update and delete Deans information

@test_case_001
    Scenario: TC_001 Admin should be able to see Name, Gender, Phone Number, SSN and User Name information of Deans
      Given navigates to "https://managementonschools.com"
      Then click on login
      Then add user name
      And add password
      And click on login button
      And click on the menu
      And click on Dean Management
      Then verify admin is able to see name
      Then verify admin is able to see gender
      Then verify admin is able to see phone number
      Then verify admin is able to see ssn
      Then verify admin is able to see user name information

@test_case_002
      Scenario: TC_002 Admin should be able to delete Deans
        Given click on the menu button
        And click on Admin Management
        Then click on delete button
        Then verify that message is Admin deleted successful

@test_case_003
        Scenario: TC_003 Admin should be able to update Deans
          And click on the menu
          And click on Dean Management
          Then click on edit button
          Then change birthplace
          Then Enter admin password
          Then click on submit button
          Then verify Deans information updated
