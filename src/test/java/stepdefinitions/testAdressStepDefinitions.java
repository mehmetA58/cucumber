package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.TestAdresssPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class testAdressStepDefinitions {
    TestAdresssPage testAdresssPage=new TestAdresssPage();
    @When("Kullanıcı adını girin")
    public void kullanıcıAdınıGirin() {
     testAdresssPage.emailTextBox.sendKeys("testtechproed@gmail.com");
    }
    @Then("şifreyi girin")
    public void şifreyi_girin() {
        testAdresssPage.passwordTextBox.sendKeys("Test1234!");

    }
    @Then("oturum aç \\(sign in)buttonunu tıklayın")
    public void oturum_aç_sign_in_buttonunu_tıklayın() {
    testAdresssPage.signInGirisButonu.click();
    }
    @Then("Expected user id nin testtechproed@gmail.com oldugunu dogrulayin\\(verify).")
    public void expected_user_id_nin_testtechproed_gmail_com_oldugunu_dogrulayin_verify() {
        Assert.assertTrue(testAdresssPage.expectedUserID.getText().equals("testtechproed@gmail.com"));

    }
    @Then("Sayfada kac tane link oldugunu bulun.")
    public void sayfada_kac_tane_link_oldugunu_bulun() {
        List<WebElement> links = new ArrayList<>(Driver.getDriver().findElements(By.tagName("a")));
        System.out.println(links.size());
    }
    @Then("linklerin yazılarını yazdiralim")
    public void linklerin_yazılarını_yazdiralim() {
        List<WebElement> links = new ArrayList<>(Driver.getDriver().findElements(By.tagName("a")));
        for(WebElement w:links)
            System.out.println(w.getText());
    }

    @And("anasayfa sign tıkla")
    public void anasayfaSignTıkla() {
    testAdresssPage.anasayfSignInButonu.click();
    }

}
