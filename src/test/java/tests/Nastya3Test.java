package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageClasses.NastyaPage;
import utilities.*;

public class Nastya3Test extends TestBase {
	
	@Test(dataProvider = "year")
	public void getPrice(String year) {
		
		NastyaPage n = new NastyaPage();
		
		BrowserUtils.scroll(0, 2000);
		BrowserUtils.waitForVisibility(n.yearInput, 3000);
		n.yearInput.click();
		n.yearInput.sendKeys(year);
	}

	@DataProvider(name = "year")
	
	public Object[][] getYear() {
		return new Object[][] { { "2015" }, { "2016" }, { "2020" } };
	}

}