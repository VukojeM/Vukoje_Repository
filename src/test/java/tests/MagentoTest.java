package tests;

import com.sun.codemodel.util.UnicodeEscapeWriter;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.MagentoPage;

import java.util.List;

public class MagentoTest extends BaseTest
{

    @Test

    public void magentoSearchTest() throws InterruptedException {

        String term = "Fitness";

        MagentoPage homePage = new MagentoPage(driver);
        homePage.searchForTerm(term);

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("product-items")));
        WebElement result = driver.findElement(By.className("product-items"));


        List<WebElement> proizvodi = result.findElements(By.className("product-item"));
        int brojac =0;
        for(WebElement proizvod:proizvodi)
        {
            brojac ++;
            System.out.println(brojac);
            System.out.println(proizvod.getText());
            Assert.assertTrue(proizvod.getText().contains(term));

        }


        Thread.sleep(3000);

    }



}
