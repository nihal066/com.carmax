package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageClasses.NastyaPage;
import utilities.BrowserUtils;

import java.util.Arrays;
import java.util.List;

public class Nastya5Test extends TestBase {

	@Test
	public void clickShop() {

		NastyaPage n = new NastyaPage();

		n.infoButton.click();
		Assert.assertTrue(n.infoMessage.isEnabled());
	}

}
