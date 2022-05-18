package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.List;

public class _12_FindElement_vs_findElements {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com");

        List<WebElement> googleNavLinks =  driver.findElements(By.xpath("//div[@class='o3j99 n1xJcf Ne6nSd']//a"));
        for (int i = 0; i <=3; i++) {
            System.out.println(googleNavLinks.get(i).getText());
            System.out.println(googleNavLinks.get(i).isDisplayed() && googleNavLinks.get(i).isEnabled() ? "PASSED" : "FAILED");
        }
        Driver.quitDriver();
    }
}
