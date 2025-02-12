package com.selenium.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Assignment4 {
    public static void main(String[] args) {

        // 1. Launch Chrome Browser
    	WebDriver driver = new ChromeDriver();

        // 2. Maximize the browser window
        driver.manage().window().maximize();

        // 3. Launch the application
        driver.get("https://www.example.com"); // Replace with the actual URL

        // 4. Locate elements
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Switch to the frame (Assuming there's an iframe with id "frameID")
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frameID"));
        WebElement frameElement = driver.findElement(By.tagName("body")); // Adjust locator as needed
        System.out.println("Frame Element Text: " + frameElement.getText());
        
        // Switch back to the main window
        driver.switchTo().defaultContent();
        WebElement mainWindowElement = driver.findElement(By.tagName("h1")); // Adjust locator as needed
        System.out.println("Main Window Element Text: " + mainWindowElement.getText());

        // 7. Close browser window
        driver.quit();
    }
}
