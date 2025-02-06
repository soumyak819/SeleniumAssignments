package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_creatio_cookiepage {

	public static void main(String[] args) {
//		Launch the Browser window (Browser = Chrome) 
		WebDriver driver = new ChromeDriver();

//		Maximize the browser window  
		driver.manage().window().maximize();

//		Delete all browser cookies 
		driver.manage().deleteAllCookies();

//		Enter URL and Launch the Application (https://www.creatio.com/)  
		driver.get("https://accounts.creatio.com/login/alm");
		
//		Locate the WebElement Cookies icon using 'xpath' Locator
		driver.findElement(By.xpath("//button[@class='CookiebotWidget-logo']"));
		
//		Locate the WebElement show details button using 'xpath' Locator
		driver.findElement(By.xpath("//button[contains(text(), 'Show details')]"));
		
//		Locate the WebElement change your consent button using 'xpath' Locator
		driver.findElement(By.xpath("//button[contains(text(), 'Change your consent')]"));
		
//		Locate the WebElement withdraw your consent button using 'xpath' Locator
		driver.findElement(By.xpath("//button[contains(text(), 'Withdraw your consent')]"));
		

	}

}
