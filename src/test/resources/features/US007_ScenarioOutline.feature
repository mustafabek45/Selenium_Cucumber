@allOutline
Feature:US007 Scenario Outline kullanimi

  Scenario Outline: TC01 Configreader ile Scenario Outline Kullanimi
    Given kullanici "<arananUrl>" sayfasina gider
    And kullanici 2 saniye bekler
    When Url'nin "<arananKelime>" icerdigini test edin
    And sayfayi kapatir
    Examples:

      | arananUrl | arananKelime |
      | amazonUrl | amazon       |
      | faceUrl   | face         |
      | googleUrl | google       |
      | brcUrl    | blue         |
