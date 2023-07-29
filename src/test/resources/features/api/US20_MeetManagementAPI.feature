@US20_API
  Feature: The teacher should be able to view, update and delete meetings(Api)

    Scenario Outline: US20_GetMeetListById

      Given Send get request by"<id>"
      Then  Body should contain id "<id>", date "<date>", description "<description>", startTime "<startTime>", stopTime "<stopTime>"
      Examples:
        | id   | date       | description | startTime | stopTime |
        | 1030 | 2023-07-27 | exam result | 10:00:00  | 10:30:00 |

