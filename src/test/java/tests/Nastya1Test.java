package tests;

import org.testng.annotations.Test;
import pageClasses.NastyaPage;
import utilities.BrowserUtils;

public class Nastya1Test extends TestBase {

	@Test
	public void getCarType() {
		
		NastyaPage n = new NastyaPage();
		
		BrowserUtils.scroll(0, 500);
		n.suvButton.click();
		n.crossover.click();

	}

}
