package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AnanasLogInPage extends BaseHelper

{

    @FindBy (id="username") WebElement usernameField;
    @FindBy (id="password") WebElement passwordField;
    @FindBy (id="login-submit") WebElement loginSubmit;
    WebDriver driver;
    public AnanasLogInPage (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //  log in with invalid credentials username
    private void loginWithUsername(String email)
    {
      wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
      usernameField.sendKeys(email);
    }

    //  log in with invalid credentials password
    private void loginWithPassword(String passwordterm)
    {
   passwordField.sendKeys(passwordterm);
    }


    private void clickOnPrijaviSe()

    {
      loginSubmit.click();
    }
    public void logInWithInvalidCredentials(String email, String passwordterm)
    {
 loginWithUsername(email);
 loginWithPassword(passwordterm);
 clickOnPrijaviSe();
    }

}
