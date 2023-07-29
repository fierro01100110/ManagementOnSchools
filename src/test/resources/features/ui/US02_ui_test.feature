@us02_ui_test

Feature:US02_Admin can see guest user list and delete user guest
  Scenario:See the guest user list and delete guest user

    Given user goes to url
    When user clicks on log in icon
    And user enters User Name
    And user enters Password
    And user clicks on log in button
    And user clicks on menu button
    And user clicks on Guest User link
    Then user verify the name header
    Then user verify the phone number header
    Then user verify the ssn number header
    Then user verify the user name header
    Then user verify the guest user list
    And user clicks on delete button
    Then user assert alert message
    And user close the app