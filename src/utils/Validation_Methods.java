package utils;


import org.openqa.selenium.WebDriver;

public class Validation_Methods {

    public static void validateTitle(WebDriver driver, String expectedTitle) {
        if (driver.getTitle().equals(expectedTitle)) System.out.println("Title is VALID!");
        else throw new RuntimeException("Title is NOT VALID!!!" +
                "\nExpected title: " + expectedTitle + " | " + "Actual title: " + driver.getTitle());
    }

    public static void validateURL(WebDriver driver, String expectedURL) {
        if (driver.getCurrentUrl().equals(expectedURL)) System.out.println("URL is VALID!");
        else throw new RuntimeException("URL is NOT VALID!!!" +
                "\nExpected URL: " + expectedURL + " | " + "Actual URL: " + driver.getCurrentUrl());

    }
}
