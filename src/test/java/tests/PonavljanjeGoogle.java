package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PonavljanjeGoogle extends BaseTest

{
    @Test
   public void googleTestSearch() throws InterruptedException {
       driver.get("https://www.google.rs/");
       WebElement searchfield  = driver.findElement(By.name("q"));
       searchfield.sendKeys("QA Revealed");

       WebElement searchButton = driver.findElement(By.name("btnK"));
       wdWait.until(ExpectedConditions.elementToBeClickable(searchButton));
       searchButton.click();
       WebElement results = driver.findElement(By.id("rcnt"));
        Assert.assertTrue("poruka ako test padne",
                results.getText().contains("www.companywall.rs"));
Thread.sleep(3000);
    }
}
