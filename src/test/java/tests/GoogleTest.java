package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.GoogleHomePage;

public class GoogleTest extends BaseTest

{
    @Test
    public void googleSearchTest() throws InterruptedException
    {
        String term = "QA Revealed";
        GoogleHomePage homepage = new GoogleHomePage(driver);
        homepage.googleSearch(term);

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("rcnt")));
        WebElement result = driver.findElement(By.id("rcnt"));
        Assert.assertTrue(result.getText().contains(term));

        Thread.sleep(3000);
    }
}
