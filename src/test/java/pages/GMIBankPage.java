package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class GMIBankPage {

    public GMIBankPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='dropdown-toggle nav-link'])[2]")
    public WebElement ilkGirisButonu;

    @FindBy (xpath = "//span[text()='Sign in']")
    public WebElement signInButonu;

    @FindBy (xpath = "//input[@name='username']")
    public WebElement gmibankUsernameKutusu;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement gmiBankPasswordKutusu;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement gmiBankSigInOkButonu;

    @FindBy (xpath = "//*[text()='employee32 employee32']")
    public WebElement girisOnayWebElementi;

    @FindBy (xpath =  "//span[.= 'User Info']")
    public  WebElement userInfoWebElementi;

    @FindBy (xpath = "//div[@role='alert']")
    public WebElement hataliGirisWebElementi;

    @FindBy (xpath = "//*[text()='employee32 employee32']")
    public WebElement kullaniciWebElemnti;

    @FindBy (xpath = "//*[text()='Sign out']")
    public WebElement signOutWebElementi;

    @FindBy (tagName = "h2")
    public WebElement signOutOnayWebElementi;

    @FindBy (xpath = "//*[text()='My Operations']")
    public WebElement myOperationWebElementi;

    @FindBy (xpath = "//*[text()='Manage Customers']")
    public WebElement manageCustomersWebElementi;
    @FindBy (id = "jh-create-entity")
    public  WebElement createNewCustomer;

    @FindBy (id ="search-ssn")
    public  WebElement searcSSN;
    @FindBy(xpath = "//button[.='Search']")
    public WebElement searchSsnButonu;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement failMessageElementi;

    @FindBy (xpath = "(//*[text()='Edit'])[1]")
    public WebElement editCustomer;

    @FindBy (xpath = "//input[@name='firstName']")
    public WebElement firstNameWebElementi;

    @FindBy (xpath = "//select[@name='country.id']")
    public WebElement countryDropdown;

    @FindBy (xpath = "//select[@name='user.id']")
    public WebElement userDropdown;

    @FindBy (xpath = "//select[@name='accounts']")
    public WebElement accountDropdown;

    @FindBy (xpath = "//span[text()='Save']")
    public WebElement saveButonu;

    @FindBy (xpath = "//tbody//tr[1]//td[2]")
    public WebElement firstCustomerWebElementi;

    @FindBy (xpath = "//tbody")
    public WebElement tBodyTumu;



    public void GMIBankLogin(){

        Driver.getDriver().get(ConfigReader.getProperty("GMIBankUrl"));

        GMIBankPage gmiBankPage = new GMIBankPage();

        gmiBankPage.ilkGirisButonu.click();

        gmiBankPage.signInButonu.click();

        gmiBankPage.gmibankUsernameKutusu.sendKeys(ConfigReader.getProperty("GMIBankValidUsername"));

        gmiBankPage.gmiBankPasswordKutusu.sendKeys(ConfigReader.getProperty("GMIBankValidPassword"));

        gmiBankPage.gmiBankSigInOkButonu.click();

    }
}