package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BlicTest extends BaseTest

{
    @Test
    public void blicSearchTest () throws InterruptedException {

        driver.get("https://www.blic.rs/");

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("search-open")));
       wdWait.until(ExpectedConditions.elementToBeClickable(By.id("search-open")));
        WebElement glass = driver.findElement(By.id("search-open"));
       glass.click();


        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("search-input")));
        //wdWait.until(ExpectedConditions.elementToBeClickable(By.id("search-input")));
        WebElement input = driver.findElement(By.id("search-input"));
        input.sendKeys("Comtrade");

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("search")));
        WebElement searchForm = driver.findElement(By.id("search"));
        WebElement glassAfter = driver.findElement(By.tagName("button"));
        glassAfter.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("section")));
        WebElement result = driver.findElement(By.className("section"));
        Assert.assertTrue(result.getText().contains("Comtrade"));


        Thread.sleep(3000);

    }
}
