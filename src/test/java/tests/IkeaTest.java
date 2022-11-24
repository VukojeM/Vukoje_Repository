package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class IkeaTest extends BaseTest

{
    @Test
    public void ikeaTest() throws InterruptedException
    {
       driver.get("https://www.ikea.com/");
        WebElement goShopping = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[1]/div/div/section/div[2]/div/div/a/span[2]"));
        goShopping.click();
        WebElement searchButton = driver.findElement(By.name("q"));
        searchButton.sendKeys("krevet");
      WebElement magGlass = driver.findElement(By.id("search-box__searchbutton"));
      magGlass.click();


Thread.sleep(4000);

    }
}
