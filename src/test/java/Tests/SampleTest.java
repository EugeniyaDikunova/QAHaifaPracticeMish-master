package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.selenium.pages.Pages.HomePageHelper;

public class SampleTest extends TestBase {

  HomePageHelper homepage;

  @BeforeMethod
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePageHelper.class);
  }

  @Test
  public void testHomePageHasAHeader() throws InterruptedException {
   /* driver.get(baseUrl);
    System.out.println("Title: " + driver.getTitle());

    Thread.sleep(5000);

    driver.findElement(By.id("closedIntro")).click();
    Thread.sleep(5000);
    System.out.println("Element: " +
            driver.findElement(By.id("idtitletypesearchevents")).getText());
    driver.findElement(By.id("idsignin")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("logininput")).click();
    driver.findElement(By.id("logininput")).sendKeys("jmenka");
    driver.findElement(By.id("passwordinput")).click();
    driver.findElement(By.id("passwordinput")).sendKeys("221263ann");
    Thread.sleep(2000);
    driver.findElement(By.id("signinrequest")).click();
    Thread.sleep(3000);*/

  }
}
