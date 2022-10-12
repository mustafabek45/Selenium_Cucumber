
@parameter
Feature: US002 Parametre Kullanimi
  Background: Ortak adim
    Given kullanici amazon sayfasina gider

  Scenario: TC01 Kullanici amazonda parametreli arama yapar

    Then kullanici "nutella" icin arama yapar
    And sonuclarin "nutella" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Kullanici amazonda parametreli arama yapar

    Then kullanici "Selenium" icin arama yapar
    And sonuclarin "Selenium" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC03 Kullanici amazonda parametreli arama yapar

    Then kullanici "Java" icin arama yapar
    And sonuclarin "Java" icerdigini test eder
    And sayfayi kapatir





     # Feature dosyasında parametreli arama yaptığımızda ""(tırnak) içine aldığımız string değeri stepDefinitionda
#Bir kere parametreli method oluşturur ve yeni bir arama yapmak istediğimizde
#Tekrar method oluşturmadan feature dosyasından ""(tırnak) içinde belirttiğimiz string ifadeyi değiştirmemiz
#yeterli olucaktır. Böylece kodlarımız dinamik olucaktır