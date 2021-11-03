package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.EditoPages;

public class editoStepDefinetions {
EditoPages editoPages=new EditoPages();

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


}
