

  Feature: US004 Parametre Kullanimi
    Scenario: Parametre kullanimi
      Given kullanici "https://www.trendyol.com" sayfasina giderr
      Then kullanici 3 saniye bekler
      When Url'nin "trend" icerdigini test edin
      And sayfayi kapatir
