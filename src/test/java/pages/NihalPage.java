package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.TestBase;
import utilities.Driver;

import java.util.List;

public class NihalPage{

    public NihalPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath  ="//h2[text()='Shop']")
    public WebElement shop;
    @FindBy(xpath = "//h2[text()='Sell']")
    public WebElement sell;
    @FindBy(xpath = "//h2[text()='Finance']")
    public WebElement finance;
    @FindBy(xpath = "//h2[text()='About']")
    public WebElement about;
    @FindBy(xpath = "//h2[text()='Careers']")
    public WebElement careers;
    @FindBy(xpath = "//h2[text()='More']")
    public WebElement more;

    @FindBy(xpath  ="//h2[@class='footer-primary-navigation-section-header']")
    public List<WebElement> footerlist;

    @FindBy(xpath = "//a[@href='/privacy-policy']")
    public WebElement privacyPolicy;


    @FindBy(xpath = "//a[@href='#privacy-contact']")
    public WebElement contactUs;

    @FindBy(xpath = "//a[.='How it Works']")
    public WebElement howItWorks;

    @FindBy(xpath = "//a[contains(text(),'Get pre-approved')]")
    public WebElement approveButton; //second page

    @FindBy(xpath = "(//button[@aria-haspopup='listbox'])[1]")
    public WebElement calculationButton;


    @FindBy(xpath = "//a[@href='https://careers.carmax.com/']")
    public WebElement searchJob;
    @FindBy(xpath = "(//input[@name='phsKeywords'])[1]")//second page
    public WebElement careerInputBox;
    @FindBy(xpath = "//input[@id='locationInput']")
    public WebElement careerInputBox2;
    @FindBy(xpath = "//input[@id='gllocationInput']")
    public WebElement searchButton;
    @FindBy(xpath = "//span[.='Accounting & Finance']")
    public WebElement inputText1;






}
