package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestAdresssPage {
    public TestAdresssPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//a[@id='sign-in'])")
    public WebElement anasayfSignInButonu;

    @FindBy(id = "session_email")
    public WebElement emailTextBox;

    @FindBy(id = "session_password")
    public WebElement passwordTextBox;

    @FindBy(xpath = "(//input[@name='commit'])")
    public WebElement signInGirisButonu;
    @FindBy(xpath = "(//span[@class='navbar-text'])")
    public WebElement expectedUserID;

    @FindBy(xpath = "//link")
    public WebElement testAdressLink;

}
