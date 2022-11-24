package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BlicHomePage extends BaseHelper

{

    @FindBy(id="search-open")    WebElement magGlass1;
    @FindBy(id="search-input")  WebElement enterTerm;
    @FindBy(tagName = "button")  WebElement magGlass2;

    public static String TekstKojiHocuDaZapamtim;
    WebDriver driver;
    public BlicHomePage (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    private void navigateToHomePage()
    {
   driver.get("https://www.blic.rs/");
   WebElement navigacija = driver.findElement(By.tagName("nav"));
    // dodela vrednosti:
        TekstKojiHocuDaZapamtim =navigacija.getText();
    }
    private void clickOnMagGlass()
    {
    wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("search-open")));
    wdWait.until(ExpectedConditions.elementToBeClickable(magGlass1));
    magGlass1.click();
    }
    private void enterTermInSearchField(String term)
    {
        //wdWait.until(ExpectedConditions.presenceOfElementLocated(enterTerm));
        wdWait.until(ExpectedConditions.elementToBeClickable(enterTerm));
        enterTerm.sendKeys(term);
    }
    private void clickOnMagGlassAfter()
    {
        // desava se da lupa menja selektor.kad god imamo u web svg tag, on nije clicabilan ili ne moze da se nadje.
        // onda gledamo drugi nacin, nadjemo tag button- to dugme nam treba, samo vodimo racuna da li je jedino digme na stranici.
        // u takvim situacijama gledamo gde se tacno nalazi nas element, idemo korak pre, tj red iznad da vidimo
        // gde se nalazi nas button. Tada uzmemo "search". resenje, ne jedino al primenljivo-
        // pronadjem taj element koji ima ID , a onda na tom elementu umesto celoj stranici trazim tag name=button.
        // lakse je naci polje pretrage, tj nas element koji nam treba jer se seta!
  wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("search")));
  magGlass2.click();

    }
    public void BlicSearchTerm (String term)
    {
       navigateToHomePage();
       clickOnMagGlass();
       enterTermInSearchField(term);
       clickOnMagGlassAfter();
    }

}
