@background
Feature: US1002 amazon Background ile Arama

    Background:amazon sayfasina gitme
    When kullanici amazon sayfasina gider


  Scenario: TC01 amazon nutella arama

    And nutella icin arama yapar
    Then sonucun nutella icerdigini test eder
    And sayfayi kapatir


  Scenario: TC02 amazon java arama

    And java icin arama yapar
    Then sonucun java icerdigini test eder
    And sayfayi kapatir


  Scenario: TC03 amazon java arama

    And ipad icin arama yapar
    Then sonucun ipad icerdigini test eder
    And sayfayi kapatir