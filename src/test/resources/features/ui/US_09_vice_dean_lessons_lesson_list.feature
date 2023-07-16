@vicedean_lessons_lessonlist
Feature: ViceDean_lessons_lessonlist

  Scenario: TC_001 vice dean can see Lesson Name, Compulsory and Credit Score
    Given user navigates to url
    Then user logs in vice dean
    And vice dean clicks Lessons button
    Then vice dean enter Lesson Name
    Then vice dean clicks Compulsory
    Then vice dean enter Credit Score
    Then vice dean clicks Submit button
    Then vice dean should be able to see "Lesson Created" message

  Scenario: TC_002 Vice Dean should be able to delete the lesson.
    And vice dean clicks Lessons button
    When vice dean clicks the last page of Lesson List
    Then vice Dean click Delete button
    And  Verify the "Lesson Deleted" message

