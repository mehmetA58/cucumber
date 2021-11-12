Feature: amazona git youtube dön

  Scenario: TC001_amazonYoutube

    ##Youtube ana sayfasina gidelim . https://www.youtube.com/
    ##Amazon soyfasina gidelim. https://www.amazon.com/
    ##Sayfa basliginin (title) “amazon” oldugunu dogrulayin. (verify)
    ##Tekrar YouTube’sayfasina donelim
    ##Sayfa URL’inin www.youtube.com oldugunu dogrulayin
    ##Yeniden Amazon sayfasina gidelim

    Given kullanici "youtubeURL" sayfasina gider
    And kullanici amazon sayfasina gider
    Then basligin "Amazon" icerdigini test eder
    And kullanici "youtubeURL" sayfasina gider
    Then kullanici URL'in "https://www.youtube.com" oldugunu dogrular
    And kullanici amazon sayfasina gider
    And sayfayi kapatir

    #Facebook ana sayfasina gidelim . https://www.facebook.com/
    #email textbox'a e-mail yazdiralim
    #şifre textbox'a şifre yazdiralim
    #giris yap butanuna tıklayalım
    #hata mesajını doğrulayalım.

  Scenario: TC002
    Given kullanici "facebookURL" sayfasina gider
    And facebookEmailTextbox'a email gönder.
    Then facebookSifreTextBox'a sifre gönder.
    Then facebookgirisyapbutonunutiklayalim
    Then FacebookBasarisizGirisMesajinidogrulayalim
    And sayfayi kapatir

    #amazon web sayfasına git
    #java için arama yap
    #bulunana sonuc sayısını yazın
  Scenario: TC03
    Given amazon web sayfasina git
    Then java icin arama yap
    Then bulunan sonuc sayisini yazdirin
    And sayfayi kapatir

#http://a.testaddressbook.com adresine gidiniz.
#Sign in butonuna basin
#Kullanıcı adını ve şifreyi girin ve oturum aç (sign in)buttonunu tıklayın
#Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
  #Username : testtechproed@gmail.com
  #Password : Test1234!
#Sayfada kac tane link oldugunu bulun.
#linklerin yazılarını yazdiralim
  Scenario: TC04
    Given kullanici "testAdressURL" sayfasina gider
    And anasayfa sign tıkla
    When Kullanıcı adını girin
    Then şifreyi girin
    Then oturum aç (sign in)buttonunu tıklayın
    And Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
    And Sayfada kac tane link oldugunu bulun.
    And linklerin yazılarını yazdiralim
    And sayfayi kapatir

    #amazon web sayfasına git
    #java için arama yap
    #bulunana sonuc sayısını yazın

  Scenario Outline:

    Given amazon web sayfasina git
    Then "<aranacaklar>" icin arama yapar
    And bulunan sonuc sayisini yazdirin
    And sayfayi kapatir
    Examples:
      | aranacaklar |
    |java         |
    |armut        |
    |iphone       |
    |mango         |










