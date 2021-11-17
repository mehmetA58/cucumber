Feature: US1012 Kullanici concort Hotel databese'ini test eder
@db
  Scenario: TC18 Concort Hotel Database Read Test

    Given kullanici CHQA databeseine baglanir
    And kullanici "tHOTELROOM" tablosundaki "Price" verilerini alir
    And kullanici "Price" sutunundaki verileri okur ve istedigi islemleri yapar
