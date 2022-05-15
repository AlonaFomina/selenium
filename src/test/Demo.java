package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) throws InterruptedException {

        //1.Set up driver
        System.setProperty("webdriver.chrome.driver","/Users/alonafomina/IdeaProjects/seleniun_intro/chromedriver");// this line sets the driver to Java
        WebDriver driver = new ChromeDriver();// this line creates and instance of the driver
        //2.Maximize  driver
        driver.manage().window().maximize();// this line maximizes the current window if it is not already maximized

        //3. Define  implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //.Navigate to Goggle web side
        driver.get("https://www.google.com");

        //5. Validate the title
        System.out.println("The title of the page is = " + driver.getTitle()); // this line returns the title of the current page as a String

        if(driver.getTitle().equals("Google")) System.out.println("Google title validation PASSED");
        else System.out.println("Google title validation FAILED!!!");

        System.out.println("End of the program");


        //6.Quit driver
        Thread.sleep(3000);// Wait for demo to quit
        driver.quit();
    }
}
