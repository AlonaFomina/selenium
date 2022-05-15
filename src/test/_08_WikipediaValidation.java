package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _08_WikipediaValidation {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.wikipedia.org/");

        WebElement heading = driver.findElement(By.className("central-textlogo"));
        if(heading.isDisplayed()) System.out.println("HEADING is DISPLAYED");
        else System.out.println("HEADING is NOT DISPLAYED");

//        WebElement logo = driver.findElement(By.className("central-textlogo__image sprite svg-Wikipedia_wordmark"));
//        if(logo.isDisplayed()) System.out.println("LOGO is DISPLAYED");
//        else System.out.println("LOGO is NOT DISPLAYED");

        WebElement search = driver.findElement(By.name("search"));
        if (search.isDisplayed()) System.out.println("Search is DISPLAYED");
        System.out.println("Search is Not DISPLAYED");

        if (driver.findElement(By.id("searchInput")).isDisplayed())System.out.println("Search is DISPLAYED");
        else System.out.println("Search is NOT DISPLAYED");

        if(driver.findElement(By.id("searchInput")).isEnabled()) System.out.println("Search enable is PASSED");
        else System.out.println("Search enable is FAILED");
        driver.quit();
    }
}
