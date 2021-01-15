package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class AfterSign {
		
		public AfterSign() {
			PageFactory.initElements(Driver.getDriver(), this);
		}
		
		@FindBy (id = "header-my-profile-button")
		public WebElement profileIcon;
		
		@FindBy (xpath = "(//li[@class='header-footer-menu-list-item'])[1]")
		public WebElement myProfile;
		
		@FindBy (xpath = "(//li[@class='header-footer-menu-list-item'])[2]")
		public WebElement savedCars;
		
		@FindBy (xpath = "(//li[@class='header-footer-menu-list-item'])[3]")
		public WebElement savedSearches;
		
		@FindBy (xpath = "(//li[@class='header-footer-menu-list-item'])[4]")
		public WebElement appointments;
		
		@FindBy (xpath = "(//li[@class='header-footer-menu-list-item'])[5]")
		public WebElement myOrders;
		
		@FindBy (xpath = "(//li[@class='header-footer-menu-list-item'])[6]")
		public WebElement makeAPayment;
		
		@FindBy (xpath = "(//li[@class='header-footer-menu-list-item'])[7]")
		public WebElement signOut;
}
