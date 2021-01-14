package tests;

import org.testng.annotations.Test;
import pages.MainPage;
import static org.testng.Assert.*;
import utilities.BrowserUtils;

public class PrivacyPolicyTest extends TestBase{

    @Test(priority = 2,groups = "A")
    public void checkPrivacyPolicy(){
        MainPage m=new MainPage();
        BrowserUtils.scroll(0,100);
        m.privacyPolicy.click();
        String actualResult=driver.getTitle();
        String expectedResult="Privacy Policy | CarMax";
        assertEquals(actualResult,expectedResult);


    }
}
