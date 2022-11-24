package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.rmi.server.ExportException;

public class AnanasMaliKucniAparatiPage extends BaseHelper

{
    @FindBy (className = "kNRBdD")
    WebElement buttonAparatizaKafu;

    public AnanasMaliKucniAparatiPage (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public void clickOnAparatiZaKafu()
    {
       wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("kNRBdD")));
       buttonAparatizaKafu.click();
    }


}
