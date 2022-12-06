package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.AnanasHomePage2;
import pages.AnanasLogInPage;

public class AnanasTest2 extends BaseTest

{
    @Test

public void ananasLogInTest() throws InterruptedException
      {

          String email = "tomsmith@ananas.rs";
          String passwordterm = "Supersecterpassword!";
          String resultMessage = "Email ili lozinka nisu u redu.";

    AnanasHomePage2 homepageObject = new AnanasHomePage2(driver);
          homepageObject.homePage2();

        AnanasLogInPage logInObject = new AnanasLogInPage(driver);
        logInObject.logInWithInvalidCredentials(email,passwordterm);

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("sc-145m2xt-0")));
          WebElement results = driver.findElement(By.className("sc-145m2xt-0"));
          Assert.assertTrue(results.getText().contains(resultMessage));

          WebElement buttonPrijaviSe = driver.findElement(By.id("login-submit"));
          Assert.assertTrue(buttonPrijaviSe.getText().contains("Prijavi se"));


        Thread.sleep(3000);
        }

    }
