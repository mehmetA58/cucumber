Feature: US1013 Kullanici DB Util ile concort Hotel databese'ini test eder
  @dbutil
  Scenario: TC19 DB Util Concort Hotel Database Read Test

    Given kullanici DBUtil ile CHQA databeseine baglanir
    And kullanici DBUtil ile "tHOTELROOM" tablosundaki "Price" verilerini alir
    And kullanici DBUtil ile "Price" sutunundaki 5.fiyatin 470 oldugunu test eder

  @dbupdate
  Scenario: Kullanici tHOTEL tablosundan istedigi Emaili update eder

    Given   kullanici DBUtil ile CHQA databeseine baglanir
    Then    DBU IDHotel degeri 1016 olan kaydin Email degerini "elveda@gmail.com" yapar
