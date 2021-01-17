package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.TestBase;
import utilities.Driver;

public class BurcuPage extends TestBase{
    public BurcuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@name='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@id='header-my-profile-button'][@aria-controls='header-my-profile-menu']")
    public WebElement icon;

    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    public  WebElement signin;
     @FindBy(xpath = "//a[contains(text(),'Create a MyCarMax account')]")
     public WebElement createAccaount;
     public WebElement submit;
     @FindBy(xpath = "//input[@name='firstname']")
     public WebElement firstname;
     @FindBy(xpath = "//input[@name='lastname']")
     public WebElement lastname;
     @FindBy(xpath = "//input[@name='email']")
     public WebElement email;
     @FindBy(xpath = "(//input[@type='password'])[1]")
     public WebElement password;
     @FindBy(xpath = "(//input[@type='password'])[2]")
     public WebElement password1;
     @FindBy(xpath = "//input[@type='Submit']")
     public WebElement register;
    @FindBy(xpath = "//input[@type='email']")

    //signin page
    public WebElement eMail;
     @FindBy(xpath = "//input[@type='password']")
    public WebElement password_a;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    //profile button
    @FindBy(xpath = "//a[@href='/mycarmax/profile']")
    public WebElement myprofile;





}
