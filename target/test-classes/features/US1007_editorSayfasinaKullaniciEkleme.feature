Feature: US1007 editor sayfasina farkli kullanicilar ekleyebilmeliyim
@Edito
  Scenario Outline: TC11 Edito sayfasina farkli kisiler ekleme

  Given kullanici "editorUrl" sayfasina gider
  Then new butonuna basar
  And editor firstname kutusuna "<firstName>" bilgileri girer
  And editor lastname kutusuna "<lastName>" bilgileri girer
  And editor position kutusuna "<position>" bilgileri girer
  And editor office kutusuna "<office>" bilgileri girer
  And editor extension kutusuna "<extension>" bilgileri girer
  And editor startdate kutusuna "<startDate>" bilgileri girer
  And editor salary kutusuna "<salary>" bilgileri girer
  And Create tusuna basar
  Then sayfayi kapatir


    Examples:
|firstName| lastName|position|office|extension|startDate|salary|
    |Mehmet   |Akbayir  |QATestLead|İstanbul|58   |12.01.2022|100000|
    |Nane   |Armut  |QATestLead|Berlin|58   |01.01.2022|100000|
    |Oguz   |Akkafa  |QATestLead|Newyork|63  |12.01.2022|100000|