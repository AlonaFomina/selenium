package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _06_Buttons_ {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com/");

        WebElement googleSearch = driver.findElement(By.className("gNO89b"));
        if(googleSearch.isEnabled()) System.out.println("Google search button validation is PASSED");
        else System.out.println("Google search button validation is NOT PASSED");

        WebElement feelingLucky = driver.findElement(By.className("gNO89b"));
        if(feelingLucky.isEnabled()) System.out.println("I'm feeling lucky button validation is PASSED");
        else System.out.println("I'm feeling lucky button validation is NOT PASSED");



        Driver.quitDriver();
    }
}
