package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NastyaPage;
import utilities.BrowserUtils;

import java.util.Arrays;
import java.util.List;

public class NastyaTest5 extends TestBase{
  @Test
    public void clickShop(){
    NastyaPage n=new NastyaPage();
    n.shpAllCar.click();
    BrowserUtils.waitForPageToLoad(3000);
    Actions actions=new Actions(driver);
    actions.moveToElement(n.keepStore).click().build().perform();
    BrowserUtils.waitForPageToLoad(1000);
    n.honda.click();
    BrowserUtils.waitForPageToLoad(1000);
    Assert.assertTrue(driver.getCurrentUrl().contains("honda"));








       }


}
