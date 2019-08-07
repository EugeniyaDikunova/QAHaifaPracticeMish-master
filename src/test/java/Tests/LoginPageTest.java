package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.selenium.pages.Pages.HomePageHelper;
import ru.stqa.selenium.pages.Pages.LoginPageHelper;

public class LoginPageTest extends TestBase {

    HomePageHelper homePage;
    LoginPageHelper loginPage;

    @BeforeMethod (alwaysRun = true)

    public void initPage (){

        homePage = PageFactory.initElements(driver,HomePageHelper.class);
        loginPage = PageFactory.initElements(driver,LoginPageHelper.class);
        homePage.waitUntilPageLoad();
        loginPage.logInPressButton();
    }
@Test
    public void loginPositive (){

        loginPage.waitUntilPageLoginLoaded()
                 .loginFieldSendKeys("jmenka")
                 .passwordFieldSendKeys("221263ann")
                .signInPressButton();
        homePage.waitUntilPageLoad()
                .getListEventsItemText();


    }
}
