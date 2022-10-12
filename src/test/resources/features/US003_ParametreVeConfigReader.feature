

  Feature: Parametre kullanimi
    @gp1
    Scenario: TC01 Parametre kullaniminda Configreader kullanimi
      Given kullanici "amazonUrl" sayfasina gider
      Then kullanici 3 saniye bekler
      When Url'nin "amazon" icerdigini test edin
      And sayfayi kapatir


    @gp2
    Scenario: TC02 Parametre kullaniminda Configreader kullanimi
      Given kullanici "faceUrl" sayfasina gider
      When Url'nin "facebook" icerdigini test edin
      And sayfayi kapatir



    @gp1
    Scenario: TC03 Parametre kullaniminda Configreader kullanimi
      Given kullanici "brcUrl" sayfasina gider
      Then kullanici 3 saniye bekler
      When Url'nin "blue" icerdigini test edin
      And sayfayi kapatir


    @gp2
    Scenario: TC04 Parametre kullaniminda Configreader kullanimi
      Given kullanici "googleUrl" sayfasina gider
      When Url'nin "google" icerdigini test edin
      And sayfayi kapatir
