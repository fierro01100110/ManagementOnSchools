@e2e_US10
Feature: Vice Dean lesson program verification


  Scenario Outline: Get the created lesson programs
    Given send get request
    Then body should contain lessonName "<lessonName>", educationTerm "<educationTerm>", day "<day>", startTime "<startTime>", stopTime "<stopTime>"
    Examples:
      | lessonName | educationTerm   | day     | startTime | stopTime |
      | Java       | SPRING_SEMESTER | TUESDAY | 10:00 PM  | 16:00 PM |
