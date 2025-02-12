package com.selenium.locators;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Spacebasic {

	public static void main(String[] args) {
		
//      1.Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
//      2.Maximize the browser window
		driver.manage().window().maximize();
	       
//      3.Launch the application
		driver.get("https://portal.spacebasic.com/login");
		
//		5. Verify application title (Welcome Back! | SpaceBasic)  
		String expectedTitle = "SpaceBasic";
        String actualTitle = driver.getTitle();
        
//      Verify the title
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification passed!");
        } else {
            System.out.println("Title verification failed! Expected: " + expectedTitle + ", but got: " + actualTitle);
        } 
        
//       6.Verify application logo
//      Locate the logo element  
        WebElement logo = driver.findElement(By.xpath("//span[@class='avatar-title rounded-circle bg-white']"));
        
     // Verify if the logo is displayed
        if (logo.isDisplayed()) {
            System.out.println("Logo verification passed!");
        } else {
            System.out.println("Logo verification failed!");
        }
        
//		7. Verify application caption (Experience the difference)
        // Locate the caption element (Update the XPath if needed)
        WebElement captionElement = driver.findElement(By.xpath("//h5[text()='Welcome Back!']"));

        // Verify if the caption text is correct
        String expectedCaption = "Welcome Back!";
        String actualCaption = captionElement.getText();

        if (actualCaption.equals(expectedCaption)) {
            System.out.println("Caption verification passed!");
        } else {
            System.out.println("Caption verification failed! Expected: " + expectedCaption + ", but got: " + actualCaption);
        }
        
//      8. Enter Invalid credentials in Email and Password textboxes
        //Locate the WebElement Email text box using 'id' Locator
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("ABC");
		
//		Locate the WebElement Password text box using 'id' Locator
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("XYZ");
		
//		9. Verify button label (Log In) and Click on Login Button
		 WebElement loginButton = driver.findElement(By.xpath("//button[text()=' Log In ']"));

	        // Verify the button label
	        String expectedLabel = "Log In";  // Ensure the correct case
	        String actualLabel = loginButton.getAttribute("value"); 

	        if (actualLabel.equals(expectedLabel)) {
	            System.out.println("Button label verification passed! Label: " + actualLabel);
	        } else {
	            System.out.println("Button label verification failed! Expected: " + expectedLabel + ", but got: " + actualLabel);
	        }

	        // Click on the Login button
	        loginButton.click();
	        System.out.println("Login button clicked!");
	        
//	        4.Locate Alert buttons
			WebElement infoAlertBtn = driver.findElement(By.xpath("//button[@id='alertButton']"));
			WebElement confirmationAlertBtn = driver.findElement(By.xpath("//button[@id='confirmButton']"));
			WebElement promptAlertBtn = driver.findElement(By.xpath("//button[@id='promtButton']"));
			
//	      5.Launch Information alert
			infoAlertBtn.click();
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert infoAlert = driver.switchTo().alert();
	     
//	      6.Print Alert message
			System.out.println(infoAlert.getText());
			
//	      7.Click on OK button
			infoAlert.accept();
	     
//	      8.Launch confirmation alert
			confirmationAlertBtn.click();
			wait.until(ExpectedConditions.alertIsPresent());
			Alert confirmationAlert = driver.switchTo().alert();
			
//	      9.Print Alert message
			System.out.println(confirmationAlert.getText());	        
		
		
		

	}

}
