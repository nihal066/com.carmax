package tests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import utilities.BrowserUtils;
import static org.testng.Assert.*;


public class HowItWorksTest extends TestBase{

    @Test(priority = 4,groups = "A")
    public void HowItWorks(){
        MainPage m = new MainPage();
        BrowserUtils.scroll(0,100);
        m.howItWorks.click();
        String actualurl=driver.getCurrentUrl();
        String expectedurl="https://www.carmax.com/car-financing";
        assertEquals(actualurl,expectedurl);

    }
    @Test(priority  =5,groups = "A")
    public void verifyText(){
        MainPage m = new MainPage();
        BrowserUtils.scroll(0,100);
        m.howItWorks.click();
        m.approveButton.click();
        assertTrue(driver.getPageSource().contains("Let's calculate a budget that works for you.*"));

    }

}
