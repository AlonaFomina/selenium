package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.Validation_Methods;
import static utils.Validation_Methods.*;

public class _2_Practice {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.facebook.com/");

        validateTitle(driver,"Facebook - log in or sign up");
        validateURL(driver,"https://www.facebook.com/");

//        if(driver.findElement(By.className("fb_logo")).isDisplayed()) System.out.println("Logo display is VALID");
//        else System.out.println("Logo  display validation FAILED");
        validateIsDisplayedByClassName(driver,"fb_logo");

//        if(driver.findElement(By.className("_8eso")).isDisplayed())
//            System.out.println("Heading 2 display is VALID");
//        else System.out.println("Heading 2 display has FAILED");
        validateIsDisplayedByClassName(driver,"_8eso");

//        if(driver.findElement(By.id("email")).isDisplayed()) System.out.println("Email or Phone Number validation is PASSED");
//        else System.out.println("Email or Phone Number validation has FAILED");
        validateIsDisplayedById(driver,"email");

//        if(driver.findElement(By.id("pass")).isDisplayed()) System.out.println("Password validation is PASSED");
//        else System.out.println("Password validation has FAILED");
        validateIsDisplayedById(driver, "pass");

//        if(driver.findElement(By.name("login")).isEnabled()) System.out.println("Lodin enable is PASSED");
//        else System.out.println("LOdin enable has FAILED");
        validateIsDisplayedByName(driver,"login");


//        if(driver.findElement(By.className("_6ltj")).isDisplayed()) System.out.println("Forgot password button validation has PASSED ");
//        else System.out.println("Forgot password button validation has FAILED ");
        validateIsDisplayedByClassName(driver,"_6ltj");

//        if(driver.findElement(By.className("_6lti")).isDisplayed()) System.out.println("Create new account has PASSED");
//        else System.out.println("Create new account has FAILED");
        validateIsDisplayedByClassName(driver,"_6lti");

        Driver.quitDriver();
    }
}
