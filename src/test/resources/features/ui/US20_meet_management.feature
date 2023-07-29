@teacher_meet_management
  Feature: Teacher meet management

    Background:
      Given Go to url
      And Click Login on the homepage
      And Log in as a Teacher by using username "FeyzaT" and password "feyzateacher123"
      Then Click on the login button


     @TC_001_US20
      Scenario: TC_001 The teacher should be able to see meeting management page
       Given Click on the menu button
       And Click on Meet Management
       Then  Verify Teacher is able to see meet management page

     @TC_002_US20
      Scenario: TC_002  Verify Teacher is able to see meet management page
        Given Click on the menu button
        And Click on Meet Management
        Then  Verify Teacher is able to see Meet List
        And Click on the Edit button
        Then Verify Teacher is able to see Edit Meet page
        And Click on the Choose Students box to update student name
        And Click on the Date Of Meet box to update date
        And Click on the Start Time box to update
        And Click on the Stop Time box to update
        And  Click on the Description box to update
        And Click on the Submit button
        Then Verify teacher sees Meet updated Successfully message
        And Close the Edit Meet page
        And  Click on the delete box
        Then Verify teacher sees Meet deleted Successfully message











