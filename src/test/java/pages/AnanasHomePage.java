package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AnanasHomePage extends BaseHelper

{

   @FindBy (className = "sc-ht0kga-4")
   WebElement buttonSveKategorije;

    @FindBy (xpath = "/html/body/div/div[3]/header/section/nav[3]/ul/li[1]/button/div/div/div/p[3]")
    WebElement buttonMaliKucniAparati;
    @FindBy (className = "sc-1rhklln-0")
    WebElement buttonSlazemSe;


    public AnanasHomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    private void navigateToHomePage()

    {
     driver.get("https://ananas.rs/");
    }
    private void  clickOnSlazemSe()
    {

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("sc-1rhklln-0")));
        buttonSlazemSe.click();
    }

    private void clickOnSveKategorije()
    {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("sc-ht0kga-4")));
        wdWait.until(ExpectedConditions.elementToBeClickable(buttonSveKategorije));
        buttonSveKategorije.click();
    }

    private void clickOnMaliKucniAparati()
    {
         wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("cySonI")));
        WebElement sveKategorije = driver.findElement(By.className("cySonI"));


        List<WebElement> listSveKategorije = sveKategorije.findElements(By.className("sc-79pcpx-0"));

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("sc-79pcpx-0")));
        wdWait.until(ExpectedConditions.elementToBeClickable(By.className("sc-79pcpx-0")));

        WebElement maliKucniAparati = listSveKategorije.get(2);
       WebElement maliKucniAparatinaslov = maliKucniAparati.findElement(By.tagName("a"));
        maliKucniAparatinaslov.click();
    }

    public void searchForMaliKucniAparati()
    {
        navigateToHomePage();
        clickOnSlazemSe();
        clickOnSveKategorije();
        clickOnMaliKucniAparati();
    }
}
