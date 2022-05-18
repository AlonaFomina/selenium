package practices;

import org.openqa.selenium.WebDriver;
import utils.Driver;

public class Facebook {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.facebook.com/");
        

        Driver.quitDriver();
    }
}
