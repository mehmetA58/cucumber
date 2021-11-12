package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FacebookPage;

public class facebookStepDefinitions {
FacebookPage facebookPage=new FacebookPage();
Faker faker=new Faker();
    @Given("facebookEmailTextbox'a email gönder.")
    public void facebook_email_textbox_a_email_gönder() {
facebookPage.facebookEmailGiris.sendKeys(faker.internet().emailAddress());
    }
    @Then("facebookSifreTextBox'a sifre gönder.")
    public void facebook_sifre_text_box_a_sifre_gönder() {
facebookPage.facebookPasswordGiris.sendKeys(faker.internet().password());
    }
    @Then("facebookgirisyapbutonunutiklayalim")
    public void facebookgirisyapbutonunutiklayalim() {
facebookPage.facebookLoginButon.click();
    }
    @Then("FacebookBasarisizGirisMesajinidogrulayalim")
    public void facebook_basarisiz_giris_mesajinidogrulayalim() {
        System.out.println(facebookPage.facebookBasarisizGirisElementi.getText());
        Assert.assertTrue(facebookPage.facebookBasarisizGirisElementi.isDisplayed());
    }
}
