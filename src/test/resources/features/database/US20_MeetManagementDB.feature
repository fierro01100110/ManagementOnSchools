@US20_DB
  Feature: "The teacher should be able to view, update and delete meetings

    Scenario Outline: US20_GetMeetList

      Given get meet via description "<description>"
      Then the body contains date "<date>", description "<description>", start_time "<start_time>", stop_time "<stop_time>"
      Examples:
        | description | date       | start_time | stop_time |
        | exam result | 2023-07-27 | 10:00:00   | 10:30:00  |

    @US20_DB_Negative
    Scenario: Teacher should be able to delete information of Meet List
      Given get meet via description "exam resulX"
      Then Body should be empty


