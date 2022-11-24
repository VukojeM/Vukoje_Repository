package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NovostiSearchPage extends BaseHelper
// НИЈЕ ДОБАР НАЗИВ ПЕЈЏКЛАСЕ NovostiSecondPage?
{

    @FindBy (className="gsc-search-button")    WebElement   searchButton;
    @FindBy(name="search") WebElement searchInput;

    WebDriver driver;
    public NovostiSearchPage (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    // click on search button 2
        private void clickOnSearchButton()
    {
        searchButton.click();
        // kako da skrolujem na search input na Novosti?
        // js.executeScript("argument[0].scrollIntoView();",searchInput);


    }

    // search for term Comtrade
    private void enterTermInSearchInput(String term)
    {
     //   wdWait.until(ExpectedConditions.urlContains("https://www.novosti.rs/c/pretraga"));
        wdWait.until(ExpectedConditions.visibilityOf(searchInput));
        js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.className("page-title")));
        searchInput.sendKeys(term);
    }


    //click on button 2
    private void clickOnSearchButton2()
    {
   searchButton.click();
    }
    public void novostiSearchTerm(String term)
    {
 // clickOnSearchButton();
  enterTermInSearchInput(term);
  clickOnSearchButton2();
    }


}

