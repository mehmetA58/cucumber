package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Set;

public class amazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @When("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }


    @When("nutella icin arama yapar")
    public void nutella_icin_arama_yapar() {

        amazonPage.aramaKutusu.sendKeys("nutella" + Keys.ENTER);
    }

    @Then("sonucun nutella icerdigini test eder")
    public void sonucun_nutella_icerdigini_test_eder() {

        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains("nutella"));

    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @When("java icin arama yapar")
    public void java_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("java" + Keys.ENTER);

    }

    @Then("sonucun java icerdigini test eder")
    public void sonucun_java_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains("java"));

    }

    @When("ipad icin arama yapar")
    public void ipad_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("ipad" + Keys.ENTER);
    }

    @Then("sonucun ipad icerdigini test eder")
    public void sonucun_ipad_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains("ipad"));

    }

    @And("{string} icin arama yapar")
    public void icinAramaYapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime + Keys.ENTER);
    }

    @Then("sonucun {string}icerdigi test eder")
    public void sonucunIcerdigiTestEder(String arananKelime) {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains(arananKelime));
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @And("sonuc sayisini yazdirir")
    public void sonucSayisiniYazdirir() {
        System.out.println(amazonPage.sonucYazisi.getText());
    }

    @Then("basligin {string} icerdigini test eder")
    public void basliginIcerdiginiTestEder(String arananKelime) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(arananKelime));
    }

    @Then("kullanici URL'in {string} oldugunu dogrular")
    public void kullanici_url_in_oldugunu_dogrular(String sayfaURL) {
        System.out.println(Driver.getDriver().getCurrentUrl());
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals(sayfaURL));
    }

    @Given("amazon web sayfasina git")
    public void amazon_web_sayfasina_git() {
      Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("java icin arama yap")
    public void java_icin_arama_yap() {
       amazonPage.aramaKutusu.sendKeys("java"+Keys.ENTER);
    }
    @Then("bulunan sonuc sayisini yazdirin")
    public void bulunan_sonuc_sayisini_yazdirin() throws InterruptedException {

        System.out.println("sonucYazisi= "+amazonPage.sonucYazisi.getText());

    }



}