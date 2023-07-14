Feature: Admin added dean api

  Scenario Outline: TC_001 admin can add dean

    Given Send post request to add dean
    Then Body contains username "<username>", name "<name>", surname "<surname>",birthday "<birthday>", ssn "<ssn>", birth_place "<birth_place>", phone_number "<phone_number>", gender "<gender>"

    Examples:
      | username | name | surname | birthday | ssn | birth_place | phone_number | gender |




  #"username": "hakanmollaoglu4",
  #"name": "Hakan",
  #"surname": "Mollaoglu",
  #"birthDay": "1970-10-10",
  #"ssn": "333-44-6666",
  #"birthPlace": "Toronto",
  #"phoneNumber": "333-999-2222",
  #"gender": "MALE"