package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _08_WikipediaValidation {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.wikipedia.org/");

        if(driver.findElement(By.tagName("h1")).isDisplayed()) System.out.println("HEADING is DISPLAYED");
        else System.out.println("HEADING is NOT DISPLAYED");

        if(driver.findElement(By.className("central-textlogo-wrapper")).isDisplayed()) System.out.println("LOGO is DISPLAYED");
        else System.out.println("LOGO is NOT DISPLAYED");


        if ( driver.findElement(By.name("search")).isDisplayed()) System.out.println("Search is DISPLAYED");
        System.out.println("Search is Not DISPLAYED");

        if (driver.findElement(By.id("searchInput")).isDisplayed())System.out.println("Search is DISPLAYED");
        else System.out.println("Search is NOT DISPLAYED");

        if(driver.findElement(By.className("pure-button")).isEnabled()) System.out.println("Search enable is PASSED");
        else System.out.println("Search enable is FAILED");
        driver.quit();
    }
}
