package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditoPages {

    public EditoPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//button[@class='dt-button buttons-create'])")
    public WebElement editorNewButonu;

    @FindBy(xpath = "(//input[@id='DTE_Field_first_name'])")
    public WebElement editorNameTextBox;

    @FindBy(xpath = "(//input[@id='DTE_Field_last_name'])")
    public WebElement editorLastNameTextBox;

    @FindBy(xpath = "(//input[@id='DTE_Field_position'])")
    public WebElement editorPositionTextBox;

    @FindBy(xpath = "(//input[@id='DTE_Field_office'])")
    public WebElement editorOfficeTextBox;

    @FindBy(xpath = "(//input[@id='DTE_Field_extn'])")
    public WebElement editorExtensionTextBox;

    @FindBy(xpath = "(//input[@id='DTE_Field_start_date'])")
    public WebElement editorStartDateTextBox;

    @FindBy(xpath = "(//input[@id='DTE_Field_salary'])")
    public WebElement editorSalaryTextBox;

    @FindBy(xpath = "(//button[@class='btn'])")
    public WebElement editorCreateButonu;

    @FindBy (xpath = "(//input[@type='search'])")
    public WebElement searchKutusu;

    @FindBy(xpath = "(//td[@class='sorting_1'])")
    public WebElement isimAramaIlkSatir;
}
