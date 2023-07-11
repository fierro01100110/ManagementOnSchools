@vicedean_lessondaystarttimestoptime
  Feature: vice dean lesson program
    Background:
      Given user navigates to url
      Then user logs in as vice dean

      Scenario: TC_001 vice dean can see lesson, day, start time and stop time created
        Then user clicks to Lesson Program
        Then verify vice dean is able to see lesson
        Then verify vice dean is able to see day
        Then verify vice dean is able to see start time
        Then verify vice dean is able to see stop time


        Scenario: TC_002 vice dean can update the lesson program list
          #Given dean navigates to menu
          #Then user clicks to the lesson management page on menu
          Then user clicks to Lesson Program
          Then verify vice dean is able to update list


          Scenario: TC_003 vice dean can delete something from the lesson program list
            Then user clicks to Lesson Program
            Then verify vice dean is able to delete something from list



