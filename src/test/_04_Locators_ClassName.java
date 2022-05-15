package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _04_Locators_ClassName {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");

        WebElement googleImage = driver.findElement(By.className("lnXdpd"));
        if(googleImage.isDisplayed()) System.out.println("Google image validation is passed");
        else System.out.println("Google image validation is Failed");

        Thread.sleep(3000);
        WebElement googleButton = driver.findElement(By.className("gNO89b"));
        if (googleButton.isDisplayed()) System.out.println("Google search is Displayed");
        else System.out.println("Google search is  NOT Displayed");


        driver.quit();
    }
}
