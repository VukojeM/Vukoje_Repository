package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.AnanasAparatiZaFilterKafuPage;
import pages.AnanasAparatiZaKafuPage;
import pages.AnanasHomePage;
import pages.AnanasMaliKucniAparatiPage;

import java.util.List;

public class AnanasTest extends BaseTest

{
    @Test

    public void searchTest() throws InterruptedException

    { String term = "ISKRA";
        AnanasHomePage homePage = new AnanasHomePage(driver);
        homePage.searchForMaliKucniAparati();

        AnanasMaliKucniAparatiPage maliKucniAparati = new AnanasMaliKucniAparatiPage(driver);
        maliKucniAparati.clickOnAparatiZaKafu();

        AnanasAparatiZaKafuPage filterKafa = new AnanasAparatiZaKafuPage(driver);
          filterKafa.clickOnAparatiZaFilterKafu();

        AnanasAparatiZaFilterKafuPage iskraFilterKafa = new AnanasAparatiZaFilterKafuPage(driver);
        iskraFilterKafa.searchForIskra();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("eXvmWo")));
        WebElement allIskraBrends = driver.findElement(By.className("eXvmWo"));


       wdWait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ais-Hits-item"))));
        List<WebElement> listOfIskraBrends = allIskraBrends.findElements(By.className("ais-Hits-item"));


        int brojac =0;
        for(WebElement iskraBrends:listOfIskraBrends)
        {
            brojac++;
                System.out.println(brojac);
                System.out.println(iskraBrends.getText());
                Assert.assertTrue(iskraBrends.getText().contains(term));
                  }

        Thread.sleep(3000);
    }


    // error: element is not attached to the page:
    //If WebDriver throws a stale element exception in this case, even though the element still exists, the reference is lost. You should discard the current reference you hold and replace it, possibly by locating the element again once it is attached to the DOM
     // use refresh
}

