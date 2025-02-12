package com.selenium.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Assignment23 {

	public static void main(String[] args) {

//		1. Launch the Browser window (Browser = Chrome) 
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
//		2. Maximize the browser window  
		driver.manage().window().maximize();

//		3. Delete all browser cookies 
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https:parabank.parasoft.com/parabank/index.htm)  
		driver.get("https:parabank.parasoft.com/parabank/index.htm");
		
//		5. Verify application title (ParaBank | Welcome | Online Banking)  
		String expectedTitle = "ParaBank | Welcome | Online Banking";
        String actualTitle = driver.getTitle();

//      Verify the title
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification passed!");
        } else {
            System.out.println("Title verification failed! Expected: " + expectedTitle + ", but got: " + actualTitle);
        }

        
//		6.Verify application logo
//        Locate the logo element
        WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
        
     // Verify if the logo is displayed
        if (logo.isDisplayed()) {
            System.out.println("Logo verification passed!");
        } else {
            System.out.println("Logo verification failed!");
        }
        
//		7. Verify application caption (Experience the difference)
        // Locate the caption element (Update the XPath if needed)
        WebElement captionElement = driver.findElement(By.xpath("//p[text()='Experience the difference']"));

        // Verify if the caption text is correct
        String expectedCaption = "Experience the difference";
        String actualCaption = captionElement.getText();

        if (actualCaption.equals(expectedCaption)) {
            System.out.println("Caption verification passed!");
        } else {
            System.out.println("Caption verification failed! Expected: " + expectedCaption + ", but got: " + actualCaption);
        }
		
        
//      8. Enter Invalid credentials in Username and Password textboxes
        //Locate the WebElement Username text box using 'id' Locator
		driver.findElement(By.name("username")).sendKeys("ABC");
		
//		Locate the WebElement Password text box using 'id' Locator
		driver.findElement(By.name("password")).sendKeys("XYZ");
		
//		9. Verify button label (LOG IN) and Click on Login Button
		 WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));

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
	        
//	    10. Verify error message is coming
	        WebElement errorMessage = driver.findElement(By.xpath("//p[contains(text(),'An internal error')]"));

            if (errorMessage.isDisplayed()) {
                System.out.println("Error message verification passed! Message: " + errorMessage.getText());
            } else {
                System.out.println("Error message verification failed! Message not displayed.");
            }
            
//      11. Click on Admin page link   
            driver.findElement(By.linkText("Admin Page")).click();
            
            
// 		12. Wait for Admin page
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(text(), 'Administration')]")));
            System.out.println("Admin Page loaded successfully!"); 
            
// 		13. Select Data access mode as 'SOAP'
            WebElement soapRadioButton = driver.findElement(By.xpath("//input[@type='radio' and @value='soap']"));
            if (!soapRadioButton.isSelected()) {
                soapRadioButton.click();
                System.out.println("Selected 'SOAP' radio button.");
            } else {
                System.out.println("'SOAP' radio button was already selected.");
            }
            
// 		14. Scroll-down till Loan provider
            WebElement loanProvider = driver.findElement(By.xpath("//b[contains(text(), 'Loan Provider:')]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loanProvider);
            
//		15. Select Loan provider as 'Web Service'
            Select loanProviderDropdown = new Select(loanProvider);
            loanProviderDropdown.selectByVisibleText("Web Service");
            
// 		16. Click on Submit button
            driver.findElement(By.xpath("//input[@value='Submit']")).click();
           
// 		17. Wait for Successful submission message
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),'Settings saved successfully.')]")));
            System.out.println("Submission successful!");
            
// 		18. Click on Services Link
            driver.findElement(By.linkText("Services")).click();
            
//		19. Wait for Services page
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Available Bookstore SOAP services')]")));
            System.out.println("Services Page loaded successfully!");

            
// 		20. Scroll-down till Bookstore services
            WebElement bookstoreServices = driver.findElement(By.xpath("//span[contains(text(),'Bookstore services')]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bookstoreServices);
            
// 		21. Get total rows and columns in the bookstore service table
            WebElement table = driver.findElement(By.xpath("//table[@id='bookstoreServicesTable']"));
            List<WebElement> rows = table.findElements(By.tagName("tr"));
            List<WebElement> columns = rows.get(0).findElements(By.tagName("th"));
		
		}
	}     