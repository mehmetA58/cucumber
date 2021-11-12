package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


@FindBy(xpath = "(//input[@id='email'])")
    public WebElement facebookEmailGiris;
    @FindBy(xpath = "(//input[@id='pass'])")
    public WebElement facebookPasswordGiris;
    @FindBy(xpath = "(//button[@name='login'])")
    public WebElement facebookLoginButon;
    @FindBy(xpath = "(//div[@class='_9ay7'])")
    public WebElement facebookBasarisizGirisElementi;
}
