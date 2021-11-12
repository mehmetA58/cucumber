Feature: US2001_GMIBank Pozitif Login

  Scenario: TC=01 Pozitif Login Testi

    When kullanici GMIBank sayfasina gider
    Then sayfaya giriş yapar
    And  sayfaya giris yaptigini dogrular
    When gmibank signout butonuna tiklar
    And gmibank sayfasindan cikis yaptigini dogrular