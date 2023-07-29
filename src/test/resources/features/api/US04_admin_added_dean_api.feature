@US04_admin_added_dean_api @Api
Feature: Admin added dean api

  Scenario Outline: TC_001 admin can add dean

    Given send get request dean by "<username>"
    Then body should contain username "<username>", birth_day "<birth_day>", birth_place "<birth_place>", gender "<gender>", name "<name>", phone_number "<phone_number>",ssn "<ssn>", surname "<surname>"

    Examples:
      | username        | birth_day  | birth_place | gender | name  | phone_number | ssn         | surname   |
      | hakanmollaoglu4 | 1970-10-10 | Toronto     | 0      | Hakan | 333-999-2222 | 333-44-6666 | Mollaoglu |

