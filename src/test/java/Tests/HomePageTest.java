package Tests;

import org.apache.http.util.Asserts;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.selenium.pages.Pages.HomePageHelper;

public class HomePageTest extends TestBase {

    HomePageHelper homePage;

    @BeforeMethod (alwaysRun = true)

    public void initPage(){

        homePage = PageFactory.initElements(driver, HomePageHelper.class);
    }

@Test
    public  void testIfHomePageIsLoaded (){

    Assert.assertEquals("List events",homePage.getListEventsItemText());
}

@Test
    public void testTitle (){
    Assert.assertEquals("Mishpahug - Shabbat within the family circle.",homePage.getHomePageTitle());

}
}
