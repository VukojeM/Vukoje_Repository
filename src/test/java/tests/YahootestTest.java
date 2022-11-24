package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.YahooHomePage;

public class YahootestTest extends BaseTest

{
    @Test
    public void yahooSearchTest() throws InterruptedException

    {
        String searchterm = "QA Revealed";
        YahooHomePage homepage = new YahooHomePage(driver);
        homepage.yahooSearch(searchterm);

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("results")));
        WebElement result =driver.findElement(By.id("results"));
        Assert.assertTrue(result.getText().contains(searchterm));
            Thread.sleep(3000);
    }
}
