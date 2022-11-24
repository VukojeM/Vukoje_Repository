package tests;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BlicHomePage;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class BlicTesttest extends BaseTest

{
    @Test

    public void BlicSearchTest() throws InterruptedException {
        String term = "Comtrade";
        BlicHomePage homePage = new BlicHomePage(driver);
        homePage.BlicSearchTerm(term);

        System.out.println("Tekst sa navigacije: " + homePage.TekstKojiHocuDaZapamtim);

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("news-box")));
        WebElement newsBox = driver.findElement(By.className("news-box"));
        //assertTrue(newsBox.getText().contains("term"));

        List<WebElement> articles = newsBox.findElements(By.tagName("article"));
        Assert.assertEquals(25, articles.size());
        System.out.println("Broj članaka liste artikala je " + articles.size());

        int brojac = 0;
        for (WebElement article : articles)
        {
            brojac = brojac + 1;
            System.out.println(brojac);
            System.out.println(article.getText());

        }

        WebElement drugiElement = articles.get(1);

        js.executeScript("arguments[0].scrollIntoView();",drugiElement);
        WebElement drugiElementNaslov = drugiElement.findElement(By.tagName("a"));
        drugiElementNaslov.click();
        Thread.sleep(4000);
    }

}