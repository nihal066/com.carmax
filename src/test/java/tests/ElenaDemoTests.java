package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.CarsChoisesPage;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class ElenaDemoTests extends TestBase{
	
	
	
	
	@Test
	public void test1() {
		
		LoginPage lp = new LoginPage();
		
		lp.suvsField.click();
		
		
		String expectedURL = "https://www.carmax.com/cars/sport-utilities";
		String actualURL = driver.getCurrentUrl();
		
		assertEquals(actualURL, expectedURL, "Urls didn't match");
	}
	
	
	
	
	
	@Test
	public void test2() {
		LoginPage lp = new LoginPage();
		lp.suvsField.click();
				
		CarsChoisesPage cc = new CarsChoisesPage();
				
		int lengthFilters = cc.filters.size();
		int expectedLengthFilters = 14;
		assertEquals(lengthFilters, expectedLengthFilters, "Length didn't match");
		
		
int length = cc.recommendedFilters.size();
		int expectedLength = 28;
		assertEquals(length, expectedLength, "Length didn't match");

	}
	
	@Test
		public void test3() {
		LoginPage lp = new LoginPage();
		
		lp.hondaField.click();
		
		
		String expectedURL = "https://www.carmax.com/cars/honda";
		String actualURL = driver.getCurrentUrl();
		
		assertEquals(actualURL, expectedURL, "Urls didn't match");
		
        
		
}
	
	@Test
	public void test4() {
		LoginPage lp = new LoginPage();
		lp.hondaField.click();
				
		CarsChoisesPage cc = new CarsChoisesPage();
				
		int lengthFilters = cc.filters.size();
		int expectedLengthFilters = 14;
		assertEquals(lengthFilters, expectedLengthFilters, "Length didn't match");
		
		int length = cc.recommendedFilters.size();
		int expectedLength = 23;
		assertEquals(length, expectedLength, "Length didn't match");
		
}


	
	@Test
	public void test5() {
		LoginPage lp = new LoginPage();
		lp.lowPriceField.click();
		CarsChoisesPage cc = new CarsChoisesPage();
		
		String actualPriceRang = cc.actualPriceRange.getText().toString();
		String expectedPriceRange = "Under $10,000";
		assertEquals(actualPriceRang, expectedPriceRange, "Price didn't match");
		
		int k = Integer.parseInt(cc.numberOfFilters.getText().toString().substring(1, 2));
		int expectedNumberOfFilters = 1;
		assertEquals(k, expectedNumberOfFilters, "Number of filters didn't match");
		
		
				
}
	
}