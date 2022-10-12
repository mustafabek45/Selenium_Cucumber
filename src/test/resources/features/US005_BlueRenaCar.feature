Feature: US1009 Ck Hotels Login

  Scenario: TC11 kullanici gecerli bilgilerle giris yapar
    Given kullanici "brcUrl" sayfasina gider
    And kullanici 2 saniye bekler
    Then Login yazisina tiklar
    And kullanici 2 saniye bekler
    And gecersiz username girer
    And kullanici 2 saniye bekler
    And gecersiz password girer
    And kullanici 2 saniye bekler
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir