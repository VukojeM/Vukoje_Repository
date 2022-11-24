
package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AnanasAparatiZaFilterKafuPage extends BaseHelper

{
    @FindBy (className = "iIvrsp")
    WebElement buttonPrikaziVise;

    @FindBy (className = "hLNQTg")
    WebElement allBrendList;

    public AnanasAparatiZaFilterKafuPage (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    private void clickOnPrikaziVise()
    {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("iIvrsp")));
        buttonPrikaziVise.click();
    }

    private void clickOnIskra()
    {
   wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("hLNQTg")));
        List<WebElement> listofBrend = allBrendList.findElements(By.className("flPXZy"));

        WebElement iskraBrend = listofBrend.get(4);
        iskraBrend.click();


    }

    public void searchForIskra()
    {
     clickOnPrikaziVise();
     clickOnIskra();
    }

}
