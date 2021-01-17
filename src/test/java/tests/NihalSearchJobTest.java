package tests;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.NihalPage;
import utilities.BrowserUtils;

public class NihalSearchJobTest extends TestBase{

    @Test(dataProvider = "job type",priority = 6,groups = "A")
    public void searchJob(String job){
        NihalPage m=new NihalPage();
        BrowserUtils.scroll(0,100);
        m.searchJob.click();
        m.careerInputBox.sendKeys(Keys.ENTER);
        m.careerInputBox.sendKeys(job+Keys.ENTER);
        System.out.println("show all available locations for "+job);


    }

    @DataProvider(name="job type")
    public Object[][] getdata(){
        return new Object[][]{
                {"Auction"},
                {"Business Office"},
                {"Human Resources"},
                {"Interns"}
        };
    }
}
