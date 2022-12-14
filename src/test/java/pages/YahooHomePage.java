package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class YahooHomePage extends BaseHelper

{
    @FindBy(id="ybar-sbq") WebElement searchField;
    @FindBy(id="ybar-search") WebElement searchButton;


    WebDriver driver;
    public YahooHomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    private void navigateToYahoo()
    {
        driver.get("https://www.yahoo.com/");
    }
    private void enterTermSearchField(String searchterm)
    {
        searchField.sendKeys(searchterm);
    }
    private void clickOnSearchButton()
    {
           searchButton.click();
    }
    public void yahooSearch(String searchterm)
    {
        navigateToYahoo();
        enterTermSearchField(searchterm);
        clickOnSearchButton();
    }
}
