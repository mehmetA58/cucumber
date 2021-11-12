Feature: My Operations

  Scenario: Invalid Customer
    Given kullanici GMIBank sayfasina gider
    Then gmibank signin butonuna tiklar
    Then kullanici gecerli username ve password girer
    And  gmibank signin butonuna basar
    Then kullanici My Opertions a tiklar
    Then kullanici Manage Customers i secer
    And kullanici Create a New Customer a tiklar
    And kullanici  "ssn" girer
    And kullanici Search button a tiklar
    Then kullanici fail message i gorur
    And sayfayi kapatir