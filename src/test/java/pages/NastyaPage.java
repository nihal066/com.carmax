package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.TestBase;
import utilities.Driver;

public class NastyaPage extends TestBase {
    public NastyaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy(xpath = "(//button[@class='vehicle-type-tile'])[1]")
    public WebElement suvButton;
    @FindBy(xpath = "(//button[@class='vehicle-type-tile'])[3]")
    public WebElement crossover;
    @FindBy(xpath = "//select[@id='credit-rating-select']")
    public WebElement dropdownMenu;

    @FindBy(xpath ="//input[@id='appraisal-form-year'][@type='tel']")
    public WebElement yearInput;

    @FindBy(xpath = "Research Best-Selling Cars")
    public WebElement findBestCar;
    @FindBy(xpath ="(//a[@href=\'/cars/all\'])[3]")
    public WebElement shpAllCar;
    @FindBy(xpath = "(//button[@class='kmx-button kmx-button--tertiary kmx-button--flat'])[1]")
   public WebElement keepStore;
    @FindBy(xpath = "(//a[@href='/cars/honda'])[2]")
    public WebElement honda;



}