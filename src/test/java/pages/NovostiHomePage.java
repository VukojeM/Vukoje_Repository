package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NovostiHomePage extends BaseHelper
{

 @FindBy(xpath = "/html/body/header/div/section[2]/div/nav/a[3]") WebDriver glass;

    WebDriver driver;
    public NovostiHomePage (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    // navigate to HomePage of Novosti
    private void navigateToHomepage()
    {
     driver.get("https://www.novosti.rs/");
    }
    // click on Magnifying glass
    private void clickOnMagGlass()
    {
   wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("search-icon")));
       WebElement glass = driver.findElement(By.className("search-icon"));
        glass.click();
    }

  public void searchHomePage()
    {
        navigateToHomepage();
        clickOnMagGlass();
    }

}
