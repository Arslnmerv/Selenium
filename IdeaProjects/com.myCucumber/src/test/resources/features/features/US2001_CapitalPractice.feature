@capital
Feature: Capital Search on Google

  Scenario Outline: capital search

    #This is can be called DDT as well.

    Given kullanici "googleUrl" sayfasina gider
    Then kullanici arama kutusuna "<capital>" yazar ve aratir
    Then  Sonucun "<capital>" icerdigini test eder


    Examples:

      | capital |
      | London  |
      | Paris   |
      | Vienna  |
      | Berlin  |
      | Madrid  |
