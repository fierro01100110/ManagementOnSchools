@new_admin_can_be_added
  Feature: Admin can add new admin
    Background:
      Given user navigates to url
      And user clicks on Login on homepage
      Then user logs in as admin

    @TC_001_new_admin
    Scenario: TC_001 Admin can add new admin
      Given user clicks on Menu
      And click on Admin Management
      And user enters a new admin name
      And user enters a new admin surname
      And user enters a new admin birth place
      And user enters a new admin phone number
      And user chooses a new admin gender
      And user enters a new admin date of birth
      And user enters a new admin ssn
      And user enters a new admin username
      And user enters a new admin password
      And user clicks on submit button on admin management
      Then Verify new Admin account is created
      Then close the application





