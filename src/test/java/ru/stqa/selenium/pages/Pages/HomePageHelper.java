package ru.stqa.selenium.pages.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


// для всех методов класс,которые относятся к HomePage

public class HomePageHelper extends PageBase {

    @FindBy(id = "idtitletypesearchevents")
    WebElement listEventsItem;

    @FindBy (id = "idsignin")
    WebElement loginButton;

    @FindBy (id = "idhome")
    WebElement homeButton;

    @FindBy (id = "adduser")
    WebElement registrationButton;

    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

public String getListEventsItemText (){

    return listEventsItem.getText();

}

    public String getHomePageTitle() {
        return driver.getTitle();
    }

public HomePageHelper waitUntilPageLoad (){

    waitUntilElementIsLoaded(driver,loginButton,30);
    waitUntilElementIsLoaded(driver,homeButton,30);
    waitUntilElementIsLoaded(driver,registrationButton,30);

    return this;
}


}


