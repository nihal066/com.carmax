package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class CarsChoisesPage {
	
	public CarsChoisesPage() {
		PageFactory.initElements(Driver.getDriver(), this);  
	}
	
	
	
	@FindBy (xpath = "//*[@class='recommended-refinement']")
	public List<WebElement> recommendedFilters;
	
	@FindBy (xpath = "//*[@class='drawer--loader']")
	public List<WebElement> filters;
	
	@FindBy (xpath = "(//*[@class='svg-icon-wrapper'])[9]")
	public List<WebElement> bestMatchFilters;
	
	@FindBy (xpath = "//*[@class='filter-count']")
	public WebElement numberOfFilters;
	
	@FindBy (xpath = "(//*[contains(text(), 'Under $10,000')])[2]")
	public WebElement actualPriceRange;
	

	
}
