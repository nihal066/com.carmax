package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage {
	
	public MainPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	
	@FindBy (id = "header-my-profile-button")
	public WebElement profileIcon;
	
	@FindBy (xpath = "//a[@href='/mycarmax/sign-in']")
	public WebElement signIn;
	
	@FindBy (xpath = "//a[@href='/mycarmax/register']")
	public WebElement register;
	
	@FindBy (xpath = "//a[@href='https://www4.carmax.com/account/summary']")
	public WebElement makePayment;
	
	@FindBy (id="header-saved-cars-button")
	public WebElement saveButton;
	
	@FindBy (id="header-my-store-button-text")
	public WebElement store;
	
	@FindBy (id="header-store-search")
	public WebElement storeSearch;
	
	@FindBy (id="header-inventory-search")
	public WebElement mainSearchBox;
	
	
	
	
	
	
	
	
}
