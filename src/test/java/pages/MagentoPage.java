package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.rmi.server.ExportException;

public class MagentoPage extends BaseHelper
{

    @FindBy(id="search")    WebElement  searchField;
   // @FindBy(className="actions")    WebElement  magGlass;
   @FindBy(xpath = "/html/body/div[2]/header/div[2]/div[2]/div[2]/form/div[2]/button")
    WebElement  magGlass;

    public MagentoPage (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //navigate to HP Magento
    private void navigateToHomePage()
    {
    driver.get("https://magento.softwaretestingboard.com/");
    }

    //enter in search field term
        private void enterTermInSearchField(String term)
    {
        wdWait.until(ExpectedConditions.elementToBeClickable(By.id("search")));
        searchField.sendKeys(term);
    }

    //click on magGlass
    private void clickOnMagGlass()

    {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/header/div[2]/div[2]/div[2]/form/div[2]/button")));
        wdWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/header/div[2]/div[2]/div[2]/form/div[2]/button")));
      magGlass.click();
    }

public void searchForTerm(String term)
{
navigateToHomePage();
enterTermInSearchField(term);
clickOnMagGlass();
}

}
