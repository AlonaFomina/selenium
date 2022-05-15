package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _07_TechGlobal_buttonIsDisplayed {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.techglobalschool.com/apply-now");

        WebElement applyNow = driver.findElement(By.className("_1zyfI"));
        if (applyNow.isDisplayed()) System.out.println("Apply now button displaying has PASSED");
        else System.out.println("Apply now button displaying has FAILED");

        WebElement enableApplyNow = driver.findElement(By.className("_1zyfI"));
        if(enableApplyNow.isEnabled()) System.out.println("Apply now button validation has PASSED");
        else System.out.println("Apply now button validation has FAILED");

        Driver.quitDriver();
    }
}
