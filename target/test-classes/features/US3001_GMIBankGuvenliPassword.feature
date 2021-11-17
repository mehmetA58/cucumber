  @gmiBankPassworcolor
  Feature: GMIBank Guvenli Sifre

      Background:dada
      Given kullanici GMIBank sayfasina gider
      Then gmibank signin butonuna tiklar
        Then gmibank register butonuna tiklar
        And gmibank password kutusuna tiklar

       Scenario Outline: Password Red Test
          Given "<password>" girer
          Then gmibankPasswordStrengthRedGorunur
         And sayfayi kapatir
         Examples:
           | password |
         |11111     |
         |AAAA       |

    Scenario Outline: Password Orange Test
      Given "<password>" girer
      Then gmibankPasswordStrengthOrangeGorunur
      And sayfayi kapatir
      Examples:
        | password |
        |11111.     |
        |AAAA?       |

    Scenario Outline: Password Yellow Test
      Given "<password>" girer
      Then gmibankPasswordStrengthYellowGorunur
      And sayfayi kapatir
      Examples:
        | password |
        |11111.aa     |
        |AAAA?mm       |
    Scenario Outline: Password Green Test
      Given "<password>" girer
      Then gmibankPasswordStrengthGreenGorunur
      And sayfayi kapatir
      Examples:
        | password |
        |11111.rr58A   |
        |AAAA?mm63A       |

