package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AnanasAparatiZaKafuPage extends BaseHelper

{
    @FindBy (className = "slick-list")
    WebElement allAparatiZaKafu;

    public AnanasAparatiZaKafuPage (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnAparatiZaFilterKafu()
    {

        List<WebElement> listofAparatiZaKafu = allAparatiZaKafu.findElements(By.className("slick-active"));
        WebElement aparatiZafilterKafu = listofAparatiZaKafu.get(1);
        aparatiZafilterKafu.click();
    }

}
