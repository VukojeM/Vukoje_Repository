package pages;

import helpers.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HerokuappPage extends BaseHelper

{
    @FindBy(name="username") WebElement username;

    @FindBy(name="password") WebElement password;

    @FindBy(className="fa-sign-in") WebElement login;

    WebDriver driver;
    public HerokuappPage (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
}

    private void navigateToHeroappPage()
    {
        driver.get("https://the-internet.herokuapp.com/login");
    }
    private void enterUsername(String user)
    {
        username.sendKeys(user);

    }

    private void enterPassword(String pass)

    {
        password.sendKeys(pass);
    }

    private void clickOnLogin()

    {
        login.click();
    }
    public void loginWithValidCredential(String user, String pass)
    {
        navigateToHeroappPage();
        enterUsername(user);
        enterPassword(pass);
        clickOnLogin();
    }
}