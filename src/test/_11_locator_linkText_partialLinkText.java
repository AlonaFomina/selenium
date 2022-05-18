package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _11_locator_linkText_partialLinkText {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com/");

        WebElement aboutLink = driver.findElement(By.linkText("About"));
        if(aboutLink.isDisplayed() && aboutLink.isEnabled()) System.out.println("About link is displayed and enable");
        else if(aboutLink.isDisplayed()) System.out.println("About Link is displayed");
        else if(aboutLink.isEnabled())System.out.println("About Link is enabled");
        else System.out.println("About link is not displayed and not enable");

        WebElement gmail = driver.findElement(By.linkText("Gmail"));
        if(gmail.isDisplayed() && gmail.isEnabled()) System.out.println("Gmail link is displayed and enable");
        else if(gmail.isDisplayed()) System.out.println("Gmail Link is displayed");
        else if(gmail.isEnabled())System.out.println("Gmail Link is enabled");
        else System.out.println("Gmail link is not displayed and not enable");

        WebElement images = driver.findElement(By.linkText("Images"));
        if(images.isDisplayed() && images.isEnabled()) System.out.println("Images link is displayed and enable");
        else if(images.isDisplayed()) System.out.println("Images Link is displayed");
        else if(images.isEnabled())System.out.println("Images Link is enabled");
        else System.out.println("Image link is  not displayed and  not enable");

        Driver.quitDriver();

        /*
        Go to https://www.google.com
        Validate the Gmail, Images, About and Store links are displayed and enabled


        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com");

        WebElement aboutLink = driver.findElement(By.linkText("About"));
        WebElement storeLink = driver.findElement(By.linkText("Store"));
        WebElement gmailLink = driver.findElement(By.partialLinkText("mail"));
        WebElement imagesLink = driver.findElement(By.partialLinkText("Ima"));

        System.out.println(aboutLink.getText()); // About
        System.out.println(storeLink.getText()); // Store
        System.out.println(gmailLink.getText()); // Gmail
        System.out.println(imagesLink.getText()); // Images

        System.out.println(aboutLink.isDisplayed() && aboutLink.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(storeLink.isDisplayed() && storeLink.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(gmailLink.isDisplayed() && gmailLink.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(imagesLink.isDisplayed() && imagesLink.isEnabled() ? "PASSED" : "FAILED");

        Driver.quitDriver();
         */
    }
}
