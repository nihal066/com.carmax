package tests;

import org.testng.annotations.Test;
import pages.NihalPage;
import static org.testng.Assert.*;
import utilities.BrowserUtils;

public class PrivacyPolicyTest extends TestBase{

    @Test(priority = 2,groups = "A")
    public void checkPrivacyPolicy(){
        NihalPage m=new NihalPage();
        BrowserUtils.scroll(0,100);
        m.privacyPolicy.click();
        String actualResult=driver.getTitle();
        String expectedResult="Privacy Policy | CarMax";
        assertEquals(actualResult,expectedResult);


    }
}
