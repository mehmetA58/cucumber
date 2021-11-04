Feature: US1010 test failed olursa screen shot calismali
  @screenshot
  Scenario: TC14 Amazon test
    When kullanici amazon sayfasina gider
    Then basligin "amazon" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC15 techproeducation test
    When kullanici "techproeducationUrl" sayfasina gider
    Then basligin "amazon" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC16 Amazon test
    When kullanici "eBayUrl" sayfasina gider
    Then basligin "amazon" icerdigini test eder
    And sayfayi kapatir