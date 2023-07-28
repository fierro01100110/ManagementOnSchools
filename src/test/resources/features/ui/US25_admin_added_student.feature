@admin_added_student
Feature: Admin added student

  Background:
    Given user goes to website url
    Then user logs in as admin on main page


  Scenario: TC_001 admin can add student
    Given admin clicks on menu button on main page
    When admin clicks to student management
    Then verify admin is able see student submit button
    Then admin clicks on choose teacher menu
    Then admin clicks on advisor teacher murat
    And admin enters student name
    And admin enters student surname
    And admin enters student birthplace
    And admin enters student email
    And admin enters student phone number
    And admin clicks on student gender male
    And admin enters student birthday
    And admin enters student ssn
    And admin enters student username
    And admin enters student father name
    And admin enters student mother name
    And admin enters student password
    And admin clicks on student submit button
    And admin sees student saved