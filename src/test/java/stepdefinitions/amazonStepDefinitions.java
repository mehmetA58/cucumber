package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class amazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();

    @When("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }


    @When("nutella icin arama yapar")
    public void nutella_icin_arama_yapar() {

        amazonPage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);
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
        amazonPage.aramaKutusu.sendKeys("java"+ Keys.ENTER);

    }
    @Then("sonucun java icerdigini test eder")
    public void sonucun_java_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains("java"));

    }
    @When("ipad icin arama yapar")
    public void ipad_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("ipad"+ Keys.ENTER);
    }
    @Then("sonucun ipad icerdigini test eder")
    public void sonucun_ipad_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains("ipad"));

    }

    @And("{string} icin arama yapar")
    public void icinAramaYapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime+ Keys.ENTER);
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
}