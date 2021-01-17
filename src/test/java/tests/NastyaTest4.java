package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NastyaPage;
import utilities.BrowserUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NastyaTest4 extends TestBase{
  @Test
    public void getBestCar(){
      NastyaPage n=new NastyaPage();
      BrowserUtils.scroll(0,100);
      BrowserUtils.waitForPageToLoad(2000);
      Assert.assertTrue(driver.getPageSource().contains("Research Best-Selling Cars"));
  }
  @Test
  public void shopAllCar(){
  NastyaPage n=new NastyaPage();
    n.shpAllCar.click();
  String actual=driver.getCurrentUrl();
    Assert.assertTrue(actual.contains("all"));
}


}


