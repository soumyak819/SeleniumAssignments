package com.selenium.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActions_parabank {

	public static void main(String[] args) {

//		Launch the Browser window (Browser = Chrome) 
		WebDriver driver = new ChromeDriver();

//		Maximize the browser window  
		driver.manage().window().maximize();

//		Delete all browser cookies 
		driver.manage().deleteAllCookies();

//		Enter URL and Launch the Application (https://www.google.co.in/)  
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		Locate the WebElement Username text box using 'name' Locator
		driver.findElement(By.name("username"));
		
//		Locate the WebElement Password text box using 'tag name' Locator
		driver.findElement(By.tagName("password"));
		
//		Locate the WebElement login button using 'tag name' Locator
		driver.findElement(By.tagName("Log In"));
		
//		Locate the WebElement 'Forgot login info?' hiperlink using 'link text' Locator
		driver.findElement(By.linkText("Forgot login info?"));
		
//		Locate the WebElement 'Register' hiperlink using ' link text' Locator
		driver.findElement(By.linkText("Register"));
		
		
		
		
		
		
	}

}
