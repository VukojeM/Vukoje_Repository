package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AnanasHomePage2 extends BaseHelper

{

    @FindBy(xpath = "/html/body/div/div[3]/header/div[2]/div/ul/li[2]")  WebElement signInButton;

    WebDriver driver;
    public AnanasHomePage2(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    // navigate to Ananas Home page
        private void navigateToHomePage()

    {
    driver.get("https://ananas.rs/");
    }

      private void clickOnSignInButton()
    {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[3]/header/div[2]/div/ul/li[2]")));
        signInButton.click();

    }


   public void homePage2()
   {
     navigateToHomePage();
     clickOnSignInButton();

   }


}

