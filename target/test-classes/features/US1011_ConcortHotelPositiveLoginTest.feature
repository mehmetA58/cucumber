Feature: US1011 kullanici dogru bilgilerle sayfaya girebilmeli
@CHQApositive
  Scenario: TC17 positive login testi
    When kullanici "CHOQAUrl" sayfasina gider
    Then CH login linkine tiklar
    And CH username kutusuna "manager" yazar
    And CH password kutusuna "Manager1!" yazar
    And CH login butonuna basar
    Then CH basarili giris yapildigini test eder