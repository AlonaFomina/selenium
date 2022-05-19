package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _15_Form_Exercise {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com/");

        WebElement subscribeForm = driver.findElement(By.xpath("//span[text()='Subscribe']"));
        System.out.println(subscribeForm.getText().equals("Subscribe") ? subscribeForm.getText()+" PASSED" : subscribeForm.getText()+" FAILED");

        WebElement formDesc = driver.findElement(By.xpath("//span[.='Stay up to date!']"));
        System.out.println(formDesc.getText().equals("Stay up to date!")? formDesc.getText()+"PASSED" : formDesc.getText()+"FAILED");

        WebElement enterName = driver.findElement(By.xpath("//input[@id='input_comp-khwayxk9']"));
        System.out.println(enterName.getAttribute("placeholder").equals("Enter your first name") ?  " PASSED" : " FAILED");

        WebElement enterLAstName = driver.findElement(By.id("input_comp-khwaz4h2"));
        System.out.println(enterLAstName.getAttribute("placeholder").equals("Enter your last name") ? enterLAstName.getText()+ " PASSED" : enterLAstName.getText()+" FAILED");

        WebElement addEmail = driver.findElement(By.id("input_comp-khwb0zsz"));
        System.out.println(addEmail.getAttribute("placeholder").equals("Add your email") ?  " PASSED" : " FAILED");

        WebElement subscribe = driver.findElement(By.xpath("//span[text()='SUBSCRIBE']/.."));
        System.out.println(subscribe.isDisplayed() && subscribe.isEnabled() ? subscribe.getText()+ " PASSED" : subscribe.getText()+" FAILED");

        Driver.quitDriver();
    }
}
