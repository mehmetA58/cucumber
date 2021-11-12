Feature: User Settings Sayfasi

  Scenario:
    Given kullanici GMIBank sayfasina gider
    Then gmibank signin butonuna tiklar
    Then kullanici gecerli username ve password girer
    And  gmibank signin butonuna basar
    Then kullanici userIcona tiklar
    Then kullanici user settings sayfasinda olmalidir
    And   kullanici language dropdown da secenekleri gorur
    Then  kullanici English ve Turkish den basaka dil seceneginin olmadigini dogrular