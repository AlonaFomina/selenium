package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _09_LocatorName {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");

        WebElement name = driver.findElement(By.name("q"));

        if(name.isDisplayed()) System.out.println("Validation is PASSED");
        else System.out.println("Validation is FAILED");
        Driver.quitDriver();
    }
}
