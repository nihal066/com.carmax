package tests;
import org.testng.annotations.Test;
import pages.NihalPage;
import utilities.BrowserUtils;

import java.io.IOException;

import static org.testng.Assert.*;


public class HowItWorksTest extends TestBase{

    @Test(priority = 4,groups = "A")
    public void HowItWorks(){
        NihalPage m = new NihalPage();
        BrowserUtils.scroll(0,100);
        m.howItWorks.click();
        String actualurl=driver.getCurrentUrl();
        String expectedurl="https://www.carmax.com/car-financing";
        assertEquals(actualurl,expectedurl);

    }
    @Test(priority  =5,groups = "A")
    public void verifyText() throws IOException {
        NihalPage m = new NihalPage();
        BrowserUtils.scroll(0,100);
        m.howItWorks.click();
        m.approveButton.click();
        String name="Screenshots";
        BrowserUtils.takeScreenshot(name);
        assertTrue(driver.getPageSource().contains("Let's calculate a budget that works for you.*"));

    }

}
