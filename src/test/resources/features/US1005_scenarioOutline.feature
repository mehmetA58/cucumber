@Paralel2
Feature: US1005 amazonda liste ile arama

  Scenario Outline: TC09 amazonda verilen bir listeyi aratıp,var olduklarını test ediniz

    Given kullanici "amazonUrl" sayfasina gider
    Then "<arananUrun>" icin arama yapar
    And sonuc sayisini yazdirir
    And sonucun "<arananUrun>"icerdigi test eder
    Then sayfayi kapatir


    Examples:
    |arananUrun|
    |nutella   |
    |java      |
    |ipod      |
    |nane      |
    |Apple     |