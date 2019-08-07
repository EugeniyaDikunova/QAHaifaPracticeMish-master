package ru.stqa.selenium.pages.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageHelper extends PageBase {

    public LoginPageHelper(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "idsignin")
    WebElement loginButton;

    @FindBy (id = "closedsignin")
    WebElement closeLoginPageButton;

    @FindBy (id = "logininput")
    WebElement yourLoginField;

    @FindBy (id = "passwordinput")
    WebElement yourPasswordField;

    @FindBy (id = "signinrequest")
    WebElement signInButton;



public LoginPageHelper waitUntilPageLoginLoaded (){

 waitUntilElementIsLoaded(driver,closeLoginPageButton, 20);
  return this;
}
    public LoginPageHelper logInPressButton (){

        waitUntilElementIsLoaded(driver,loginButton,20);
        loginButton.click();
        return this;
    }
public LoginPageHelper closeLoginPageButtonPress(){
    closeLoginPageButton.click();
    return this;
}
public LoginPageHelper loginFieldSendKeys (String value){
   setValueToField(yourLoginField,value);
   return this;
}

    public LoginPageHelper passwordFieldSendKeys (String value){
        setValueToField(yourPasswordField, value);
        return this;
    }

    public LoginPageHelper signInPressButton (){

        waitUntilElementIsLoaded(driver,signInButton,20);
        signInButton.click();
        return this;
    }
}

