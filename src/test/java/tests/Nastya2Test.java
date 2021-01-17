package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageClasses.NastyaPage;
import utilities.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Nastya2Test extends TestBase {
	@Test
	public void dropdownTest() {

		NastyaPage n = new NastyaPage();

		BrowserUtils.scroll(0, 800);
		BrowserUtils.waitForPageToLoad(2000);

		Select select = new Select(n.dropdownMenu);

		System.out.println(select.getFirstSelectedOption().getText());
		List<WebElement> options = select.getOptions();
		List<String> expectedlist = Arrays.asList("Excellent (800+ FICO® Score)" + "Very Good (740-799 FICO® Score)"
				+ "Good (670-739 FICO® Score)" + "Fair (580-669 FICO® Score)" + "Challenged (< 580 FICO® Score)");

		List<String> actualList = new ArrayList<>();

		for (WebElement w : options) {
			actualList.addAll(Collections.singleton(w.getText()));
		}

		System.out.println(actualList);

		Assert.assertTrue(actualList.contains("Good (670-739 FICO® Score)"));
		Assert.assertTrue(actualList.contains("Excellent (800+ FICO® Score)"));

	}

}
