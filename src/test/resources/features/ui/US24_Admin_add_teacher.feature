@US24
  Feature: Admin should be able to add Teacher

    @TC_001
    Scenario: TC_001 Admin should be able login
      Given navigates to "https://managementonschools.com"
      Then click on login
      Then add user name
      And add password
      And click on login button
      And click on the menu


      @TC_002
      Scenario Outline: Admin should be able to add Teacher
        When Admin clicks on the Teacher Management link
       # Then Admin chooses a lesson "<lesson>"
        And Admin enters a name "<name>"
        And Admin enters a surname "<surname>"
        And Admin enters a birth place "<birth_place>"
        And Admin enters an email "<email>"
        And Admin enters phone_number "<phone_number>"
        And Admin selects on the Advisor Teacher checkbox if the teacher has an advisory role
        And Admin selects an gender "<gender>" option checkbox
        And Admin enters Date Of Birth "<dateOfBirth>"
        And Admin enters ssn number in "<ssn>"
        And Admin enters username "<username>"
        And Admin enters password "<password>"
        And Admin clicks on Submit
        And verify the Admin sees the Teacher Saved Successfully message
        And close the application
        Examples:
          | lesson   | name  | surname | birth_place | email           | phone_number | gender | dateOfBirth | ssn         | username | password |
          | Selenium | Simon | Kurpa   | Vancouver   | skurpa@yahoo.ca | 587-987-6548 | M      | 2000-04-24  | 321-32-3210 | KURPA    | SKRP.123 |
