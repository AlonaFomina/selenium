package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _05_Locatior_Id_ {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.navigate().to("https://www.techglobalschool.com/");

        WebElement techGlobalLogo = driver.findElement(By.id("img_comp-kuiqjide2"));
        if (techGlobalLogo.isDisplayed()) System.out.println("Logo validation PASSED");
        else System.out.println("logo validation FAILED");

        WebElement companyName = driver.findElement(By.id("comp-kuiqjidf"));
        if (companyName.isDisplayed() && companyName.getText().equals("TechGlobal")) System.out.println("Company name validation is PASSED");
        else System.out.println("Company name validation is FAILED");



        WebElement companyQuote = driver.findElement(By.id("comp-kuiqjidf1"));
        if (companyQuote.isDisplayed() && companyQuote.getText().equals("OUR GOAL IS YOUR SUCCESS")) System.out.println("Company quote validation is PASSED");
        else System.out.println("Company quote validation is FAILED");
        System.out.println(companyQuote.getText());
        Driver.quitDriver();

    }
}
