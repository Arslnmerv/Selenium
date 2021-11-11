Feature: US001 Amazon Search

  @amazon
  Scenario: Amazona gidelim
    When kullanici amazon sayfasina gider
    And nutella icin arama yapar
    Then sonucun nutella icerdigini test eder
    And sayfayi kapatir

  @amazon @java
  Scenario:  TC02 amazon java arama
    When kullanici amazon sayfasina gider
    And java icin arama yapar
    Then sonucun java icerdigini test eder
    And sayfayi kapatir
