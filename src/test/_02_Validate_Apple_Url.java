package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _02_Validate_Apple_Url {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/alonafomina/IdeaProjects/seleniun_intro/chromedriver");// this line sets the driver to Java
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.apple.com");

        String expected = "https://www.apple.com/";
        String real = driver.getCurrentUrl();

        if (expected.equals(real)) System.out.println("URL validation has PASSED");
        else System.out.println("URL validation has FAILED!!!");

        Thread.sleep(3000);
        driver.quit();
    }
}
