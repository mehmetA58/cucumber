package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.GMIBankPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class GMIBankStepDefinitions {
    GMIBankPage gmiBankPage=new GMIBankPage();
    @When("kullanici GMIBank sayfasina gider")
    public void kullanici_gmi_bank_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("GMIBankUrl"));
    }
    @Then("sayfaya giriş yapar")
    public void sayfaya_giris_yapar() {
    gmiBankPage.GMIBankLogin();
    }
    @Then("sayfaya giris yaptigini dogrular")
    public void sayfaya_giris_yaptigini_dogrular() {
        Assert.assertTrue(gmiBankPage.girisOnayWebElementi.isDisplayed());
    }
    @When("gmibank signout butonuna tiklar")
    public void gmibank_signout_butonuna_tiklar() {
        gmiBankPage.girisOnayWebElementi.click();
        gmiBankPage.signOutWebElementi.click();

    }
    @When("gmibank sayfasindan cikis yaptigini dogrular")
    public void gmibank_sayfasindan_cikis_yaptigini_dogrular() {
Assert.assertTrue(gmiBankPage.signOutOnayWebElementi.isDisplayed());
    }

    @Then("gmibank signin butonuna tiklar")
    public void gmibankSigninButonunaTiklar() {
        gmiBankPage.ilkGirisButonu.click();
        gmiBankPage.signInButonu.click();
    }

    @And("gmibank username kutusuna {string} yazar")
    public void gmibankUsernameKutusunaYazar(String arg0) {
        gmiBankPage.gmibankUsernameKutusu.sendKeys(arg0);
    }

    @And("gmibank password kutusuna {string} yazar")
    public void gmibankPasswordKutusunaYazar(String arg0) {
        gmiBankPage.gmiBankPasswordKutusu.sendKeys(arg0);
    }

    @And("gmibank signin butonuna basar")
    public void gmibankSigninButonunaBasar() {
        gmiBankPage.gmiBankSigInOkButonu.click();
    }

    @Then("gmibank giris yapilamadigini test eder")
    public void gmibankGirisYapilamadiginiTestEder() {
        Assert.assertTrue(gmiBankPage.hataliGirisWebElementi.isDisplayed());
    }

    @Then("kullanici gecerli username ve password girer")
    public void kullaniciGecerliUsernameVePasswordGirer() {
     gmiBankPage.gmibankUsernameKutusu.sendKeys(ConfigReader.getProperty("gmibankUsernameValid"));
     gmiBankPage.gmiBankPasswordKutusu.sendKeys(ConfigReader.getProperty("gmibankUPasswordValid"));
    }

    @Then("kullanici userIcona tiklar")
    public void kullaniciUserIconaTiklar() {

        gmiBankPage.girisOnayWebElementi.click();
        gmiBankPage.userInfoWebElementi.click();
    }

    @Then("kullanici user settings sayfasinda olmalidir")
    public void kullaniciUserSettingsSayfasindaOlmalidir() {
        String expectedURL="https://www.gmibank.com/account/settings";
        String actualURL=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.equals(expectedURL));
    }

    @And("kullanici language dropdown da secenekleri gorur")
    public void kullaniciLanguageDropdownDaSecenekleriGorur() {
        Select select=new Select(Driver.getDriver().findElement(By.id("langKey")));
        List<WebElement>language=select.getOptions();
        List<String>l=new ArrayList<>();
        for (WebElement w:language) {
            l.add(w.getText());
        }
        System.out.println(l);
    }

    @Then("kullanici English ve Turkish den basaka dil seceneginin olmadigini dogrular")
    public void kullaniciEnglishVeTurkishDenBasakaDilSecenegininOlmadiginiDogrular() {
        Select select=new Select(Driver.getDriver().findElement(By.id("langKey")));
        List<WebElement>language=select.getOptions();

        List<String>l=new ArrayList<>();
        for (WebElement w:language) {
           boolean l1=w.getText().equals("Türkçe") || w.getText().equals("English");
           Assert.assertTrue("user can only select English or Türkçe",l1);
        }

    }

    @Then("kullanici My Opertions a tiklar")
    public void kullaniciMyOpertionsATiklar() {
        gmiBankPage.myOperationWebElementi.click();
    }

    @Then("kullanici Manage Customers i secer")
    public void kullaniciManageCustomersISecer() {
        gmiBankPage.manageCustomersWebElementi.click();
    }

    @And("kullanici Create a New Customer a tiklar")
    public void kullaniciCreateANewCustomerATiklar() {
        gmiBankPage.createNewCustomer.click();
    }

    @And("kullanici  {string} girer")
    public void kullaniciGirer(String ssn) {
        gmiBankPage.searcSSN.sendKeys(ConfigReader.getProperty("ssn"));

    }

    @And("kullanici Search button a tiklar")
    public void kullaniciSearchButtonATiklar() {
        gmiBankPage.searchSsnButonu.click();
    }

    @Then("kullanici fail message i gorur")
    public void kullaniciFailMessageIGorur() throws InterruptedException {
       Thread.sleep(2000);
        Assert.assertTrue(gmiBankPage.failMessageElementi.isDisplayed());
    }
}
