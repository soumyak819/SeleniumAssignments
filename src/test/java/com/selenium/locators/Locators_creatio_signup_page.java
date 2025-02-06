package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_creatio_signup_page {

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
		
//		Locate the WebElement Business email text box using 'xpath' Locator
		driver.findElement(By.xpath("//label[text()='Business email']"));
		
//		Locate the WebElement password text box using 'cssSelctor' Locator
		driver.findElement(By.cssSelector("input[type='password']"));
		
//		Locate the WebElement Continue button using 'xpath' Locator
		driver.findElement(By.xpath("//span[contains(text(),' CONTINUE ')]"));
		
//		Locate the WebElement Log in button using 'xpath' Locator
		driver.findElement(By.xpath("//span[contains(text(),' LOG IN')]"));
		
//		Locate the WebElement terms and conditions link using 'linkText' Locator
		driver.findElement(By.linkText("Free trial terms and conditions"));
		
		
//		Locate the WebElement First name text field using 'xpath' Locator
		driver.findElement(By.xpath("//label[contains(text(), 'First name')]"));	
		
//		Locate the WebElement Last name text field using 'xpath' Locator
		driver.findElement(By.xpath("//label[contains(text(), 'Last name')]"));
		
//		Locate the WebElement Company text field using 'xpath' Locator
		driver.findElement(By.xpath("//label[contains(text(), 'Company')]"));
		
//		Locate the WebElement Website text field using 'xpath' Locator
		driver.findElement(By.xpath("//label[contains(text(), 'Website')]"));
		
//		Locate the WebElement Country drop down using 'xpath' Locator
		driver.findElement(By.xpath("//label[contains(text(), 'Country')]"));
		
//		Locate the WebElement Phone text field using 'xpath' Locator
		driver.findElement(By.xpath("//label[contains(text(), 'Phone')]"));
		
//		Locate the WebElement Sign up button using 'xpath' Locator
		driver.findElement(By.xpath("//span[contains(text(), 'SIGN UP')]"));
		
	}

}
