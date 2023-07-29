@US16_UI
Feature: Contact_Get_All_Menu

@user_send_contact_messages
  Scenario Outline: TC_002 user send contact messages
    Given user navigates to url
    When user clicks Contact button
    Then user enters a name "<name>"
    Then user enters an email "<email>"
    Then user enters a subject "<subject>"
    Then user enters a message "<message>"
    And user clicks on Send Message button
    Then assert alert message on contact page
    And user clicks on Send Message button
    Then assert alert message on contact page

    Examples:
      | name  | email                      | subject | message                  |
      | Dunya | nereyegeldik@neredeyiz.com | Konumuz | Nerereden Cikti Bu Mesaj |

  @Vice_Dean_Get_Messages_And_Verify
    Scenario Outline: TC_002 vice dean see the messages
    Given user navigates to url
    Then user logs in as vice dean
    Then vice dean clicks on menu button
    Then vice dean clicks to contact get all link
    Then vice dean verify the name "<name>"
    Then vice dean verify the email "<email>"
    Then vice dean verify the subject "<subject>"
    Then vice dean verify the date "<date>"
    Then vice dean verify the message "<message>"


    Examples:
      | name  | email                      | subject | date       | message                  |
      | Dunya | nereyegeldik@neredeyiz.com | Konumuz | 2023-07-30 | Nerereden Cikti Bu Mesaj |













