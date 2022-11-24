package pages;

import helpers.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleHomePage extends BaseHelper

{
    @FindBy(name="q") WebElement searchField;
    @FindBy(name="btnK") WebElement searchButton;


    // custom konstruktor = spec metoda koja pravi objekat kada treba. test je na chromu, i da nema ovog dole konstuktora
    // sistem bi svaki put kada bi kreirala objekat otvarao novi chrom. na jednom chromu bi otvorio prvu str , onda drugu str za drugi korak
    // umesto sve na jednom. da se to ne bi desavao kreiramo ovu dole metodu, da svaki objekat izvrsava na isto chromu.

        WebDriver driver;
    public GoogleHomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    private void navigateToHomePage()

    {
 driver.get("https://www.google.com/");
    }

   private void enterTermSearchField(String searchTerm)

    {
  searchField.sendKeys( searchTerm);
    }

    private void clickOnSearchButton()
    {
  wdWait.until(ExpectedConditions.elementToBeClickable(searchButton));
  searchButton.click();
    }

    public void googleSearch(String searchTerm)
    {
navigateToHomePage();
enterTermSearchField(searchTerm);
clickOnSearchButton();
    }
}


