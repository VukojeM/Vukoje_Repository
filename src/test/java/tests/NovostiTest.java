package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.NovostiHomePage;
import pages.NovostiSearchPage;

import java.util.List;

public class NovostiTest extends BaseTest

{
    @Test
        public void novostiHP() throws InterruptedException
    {

        String term ="Comtrade";
        NovostiHomePage homePage = new NovostiHomePage(driver);
        homePage.searchHomePage();

       NovostiSearchPage searchForTerm = new NovostiSearchPage(driver);
        searchForTerm.novostiSearchTerm(term);

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("gsc-resultsbox-visible")));
        WebElement area = driver.findElement(By.className("gsc-resultsbox-visible"));
        //Assert.assertTrue(area.getText().contains(term));

        List<WebElement> articles = area.findElements(By.className("gsc-result"));

        Assert.assertEquals(10, articles.size());
        System.out.println("Broj pronadjenih clanaka je "+articles.size());

         int brojac =0;
        for (WebElement clanci:articles)
        {
            brojac++;
            System.out.println(brojac);
            System.out.println(clanci.getText());
        }



        Thread.sleep(4000);
    }
}


