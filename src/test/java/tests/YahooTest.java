package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class YahooTest extends BaseTest
{
    @Test
 public void yahooSearchTest () throws InterruptedException {
   driver.get("https://www.yahoo.com/");
     WebElement searchField = driver.findElement(By.id("ybar-sbq"));
     searchField.sendKeys("QA Revealed");
     WebElement searchButton = driver.findElement(By.id("ybar-search"));
        searchButton.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("results")));
             WebElement result = driver.findElement(By.id("results"));
             Assert.assertTrue(result.getText().contains("QA Revealed"));
            Thread.sleep(4000);
 }

}
