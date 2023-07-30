@vice_dean_student_creation @smokeTest

Feature: Verify Student Creation on API

  Scenario: TC_001 verify student creation
    Given send get request by student id
    Then validate the body student creation after upgrade