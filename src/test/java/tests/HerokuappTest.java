package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.HerokuappPage;

public class HerokuappTest extends BaseTest

{
    @Test
    public void heroappTest() throws InterruptedException
    {

        HerokuappPage logIn = new HerokuappPage(driver);
        logIn.loginWithValidCredential("tomsmith", "SuperSecretPassword!");

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("flash")));
        WebElement loggedIn = driver.findElement(By.id("flash"));
        Assert.assertTrue(loggedIn.getText().contains("You logged into a secure area!"));

        WebElement logOut = driver.findElement(By.className("radius"));
        Assert.assertTrue(logOut.getText().contains("Logout"));
 Thread.sleep(3000);
    }

    @Test
    public void logInWithInvalidCredentials() throws InterruptedException {

        HerokuappPage logIn = new HerokuappPage(driver);
        logIn.loginWithValidCredential("badusername", "SuperSecretPassword!");

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("flash")));
        WebElement loggedIn = driver.findElement(By.id("flash"));
        Assert.assertTrue(loggedIn.getText().contains("Your username is invalid!"));

        WebElement logOut = driver.findElement(By.className("fa-sign-in"));
        Assert.assertTrue(logOut.getText().contains("Login"));

        Thread.sleep(3000);
    }
}
