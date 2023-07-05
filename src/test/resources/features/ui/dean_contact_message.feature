@dean_contact_message
  Feature: Dean contact message

    Background:
      Given user navigates to url
      Then user logs in as dean


      Scenario: TC_001 dean can see delete button
        Given dean navigates to menu
        When dean clicks to contact get all
        Then verify dean is able see delete button

        Scenario: TC_002 dean can view messages, authors, emails, sending dates and subject information
          Given dean navigates to menu
          When dean clicks to contact get all
          Then verify dean is able to see messages
          And verify dean is able to see authors
          And verify dean is able to see emails
          And verify dean is able to see sending dates
          And verify dean is able to see subject information


