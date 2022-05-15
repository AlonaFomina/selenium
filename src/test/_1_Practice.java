package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static utils.Validation_Methods.*;

import java.util.concurrent.TimeUnit;

public class _1_Practice {
    // URLs here
    static final String firstUrl = "https://www.dior.com/en_us";
    static final String secondUrl = "https://www.dior.com/en_us/fashion";
    static final String thirdURL ="https://www.dior.com/en_us/womens-fashion/shoes/sneakers";


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/alonafomina/IdeaProjects/seleniun_intro/chromedriver");// this line sets the driver to Java
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        String currentTitle = driver.getTitle();
        String currentURL = driver.getCurrentUrl();

        String expectedURL = "https://www.dior.com/en_us";
        String expectedTitle = "Dior official website | DIOR";

        try {
            driver.get(firstUrl);
            Thread.sleep(3000);

            validateTitle(driver, "Dior official website | DIOR");
            validateURL(driver, "https://www.dior.com/en_us");
            Thread.sleep(3000);

            driver.navigate().to(secondUrl);
            validateURL(driver, "https://www.dior.com/en_us/fashion");
            validateTitle(driver,"MODE & ACCESSOIRES | DIOR");
            Thread.sleep(3000);

            driver.navigate().to(thirdURL);
            validateURL(driver,"https://www.dior.com/en_us/womens-fashion/shoes/sneakers");
            validateTitle(driver,"Designer Sneakers — Women's Shoes | DIOR");
            Thread.sleep(3000);



        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
