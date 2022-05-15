package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class _01_Validate_Apple_Title {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/alonafomina/IdeaProjects/seleniun_intro/chromedriver");// this line sets the driver to Java
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.apple.com");
        System.out.println("The title of the page is = " + driver.getTitle());

        if(driver.getTitle().equals("Apple")) System.out.println("Apple title validation PASSED");
        else System.out.println("Apple title validation FAILED!!!");

        Driver.quitDriver();
    }
}
