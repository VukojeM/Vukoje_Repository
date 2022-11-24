package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginwithvalidcredentialsTest extends BaseTest

{
    @Test
    public void validCredentials() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/login");
        String username = "tomsmith";
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys(username);
        String password = "SuperSecretPassword!";
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(password);
        WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button/i"));
        login.click();
         WebElement messageField = driver.findElement(By.id("flash"));
        String message = "You logged into a secure area!";
        Assert.assertTrue(messageField.getText().contains(message));
        WebElement logout = driver.findElement(By.className("icon-signout"));
        Assert.assertTrue(logout.getText().contains("Logout"));
        Thread.sleep(4000);
            }
}
