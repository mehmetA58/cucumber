package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EditoPages;
import utilities.Driver;

public class editoStepDefinetions {
EditoPages editoPages=new EditoPages();
Actions actions=new Actions(Driver.getDriver());

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
editoPages.editorNewButonu.click();
    }

    @Then("editor firstname kutusuna {string} bilgileri girer")
    public void editor_firstname_kutusuna_bilgileri_girer(String firstName) {
editoPages.editorNameTextBox.sendKeys(firstName);
    }

    @Then("editor lastname kutusuna {string} bilgileri girer")
    public void editor_lastname_kutusuna_bilgileri_girer(String lastName) {
editoPages.editorLastNameTextBox.sendKeys(lastName);
    }

    @Then("editor position kutusuna {string} bilgileri girer")
    public void editor_position_kutusuna_bilgileri_girer(String position) {
editoPages.editorPositionTextBox.sendKeys(position);
    }

    @Then("editor office kutusuna {string} bilgileri girer")
    public void editor_office_kutusuna_bilgileri_girer(String office) {
editoPages.editorOfficeTextBox.sendKeys(office);
    }

    @Then("editor extension kutusuna {string} bilgileri girer")
    public void editor_extension_kutusuna_bilgileri_girer(String extension) {
editoPages.editorExtensionTextBox.sendKeys(extension);
    }

    @Then("editor startdate kutusuna {string} bilgileri girer")
    public void editor_startdate_kutusuna_bilgileri_girer(String startDate) {
editoPages.editorStartDateTextBox.sendKeys(startDate);
    }

    @Then("editor salary kutusuna {string} bilgileri girer")
    public void editor_salary_kutusuna_bilgileri_girer(String salary) {
editoPages.editorSalaryTextBox.sendKeys(salary);
    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
editoPages.editorCreateButonu.click();
    }


    @And("editor ilgili kutulara {string}{string}{string}{string}{string}{string}{string} bilgileri girer")
    public void editorIlgiliKutularaBilgileriGirer(String firstName, String lastName, String position, String office, String extension, String startDate, String salary) {

        actions.click(editoPages.editorNewButonu)
                .sendKeys(editoPages.editorNameTextBox,firstName)
                .sendKeys(Keys.TAB)
                .sendKeys(editoPages.editorLastNameTextBox,lastName)
                .sendKeys(Keys.TAB)
                .sendKeys(editoPages.editorPositionTextBox,position)
                .sendKeys(Keys.TAB)
                .sendKeys(office)
                .sendKeys(Keys.TAB)
                .sendKeys(extension)
                .sendKeys(Keys.TAB)
                .sendKeys(startDate)
                .sendKeys(Keys.TAB)
                .sendKeys(salary)
                .click(editoPages.editorCreateButonu).perform();
    }

    @Then("{string} ve {string} girerek kaydin tamamlandigini test eder.")
    public void veGirerekKaydinTamamlandiginiTestEder(String firstName, String lastName) throws InterruptedException {
        Thread.sleep(2000);
        editoPages.searchKutusu.click();
        editoPages.searchKutusu.sendKeys(firstName + " " + lastName);
        Assert.assertTrue(editoPages.isimAramaIlkSatir.isDisplayed());
    }
}
