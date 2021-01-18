package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageClasses.NastyaPage;
import utilities.BrowserUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Nastya4Test extends TestBase {
	
	@Test
	public void test1() {
		
		NastyaPage n = new NastyaPage();
		
		BrowserUtils.scroll(0, 2300);
		BrowserUtils.waitForPageToLoad(2000);
		Assert.assertTrue(driver.getPageSource().contains("Research Best-Selling Cars"));
	}

	@Test
	public void test2() {
		
		NastyaPage n = new NastyaPage();
		
		n.researchMore.click();
		String actual = driver.getCurrentUrl();
		Assert.assertTrue(actual.contains("/articles"));
		

		
	}

}
