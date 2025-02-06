package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_creatio_login_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Launch the Browser window (Browser = Chrome) 
		WebDriver driver = new ChromeDriver();

//		Maximize the browser window  
		driver.manage().window().maximize();

//		Delete all browser cookies 
		driver.manage().deleteAllCookies();

//		Enter URL and Launch the Application (https://www.creatio.com/)  
		driver.get("https://accounts.creatio.com/login/alm");
		
//		Locate the WebElement Username text box using 'id' Locator
		driver.findElement(By.id("8b0b088d-d574-f225-d505-6bd5854ad4c2"));
		
//		Locate the WebElement Password text box using 'id' Locator
		driver.findElement(By.id("70943eab-d10e-5357-9dad-05e0efe0c693"));
		
//		Locate the WebElement Login button using 'xpath' Locator
		driver.findElement(By.xpath("//span[text()=' LOG IN ']"));
		
//		Locate the WebElement forgot-password-link using 'link text' Locator
		driver.findElement(By.linkText("Forgot password"));
		
//		Locate the WebElement eye icon using 'id' Locator
		driver.findElement(By.id("Component_2433_33"));
		
//		Locate the WebElement linkedin icon using 'xpath' Locator
		driver.findElement(By.xpath("//img[@class='icon-LinkedIn']"));
		
//		Locate the WebElement google icon using 'xpath' Locator
		driver.findElement(By.xpath("//img[@class='icon-google']"));
		
//		Locate the WebElement facebook icon using 'xpath' Locator
		driver.findElement(By.xpath("//img[@class='icon-facebook']"));
		
//		Locate the WebElement Don’t have an account? using 'xpath' Locator
		driver.findElement(By.xpath("//span[text()='Don’t have an account?']"));
		
//		Locate the WebElement Sign up using 'xpath' Locator
		driver.findElement(By.xpath("//span[contains(text(), 'SIGN UP')]"));
		
		
		
		
		
		
		
		
		
		
	}

}
