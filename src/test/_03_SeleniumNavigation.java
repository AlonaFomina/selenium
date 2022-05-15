package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class _03_SeleniumNavigation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/alonafomina/IdeaProjects/seleniun_intro/chromedriver");// this line sets the driver to Java
        WebDriver driver = Driver.getDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.techglobalschool.com/");
        driver.navigate().refresh();
        String techURL = driver.getCurrentUrl();
        String expected = "https://www.techglobalschool.com/";
        driver.navigate().to("https://www.amazon.com/");
        String amazonDriver = driver.getTitle();
        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        driver.navigate().back();
        driver.navigate().forward();


        if(techURL.equals(expected)) System.out.println("The validation for Tech Global Passed");
        else System.out.println("The validation for Tech Global Failed");

        if (amazonDriver.equals(expectedTitle)) System.out.println("The validation for Amazon Passed");
        else System.out.println("The validation for Amazon Passed");

        Driver.quitDriver();
    }
}
