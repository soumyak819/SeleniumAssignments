package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {

//      1.Launch Chrome Browser
		WebDriver driver = new ChromeDriver();

//      2.Maximize the browser window
		driver.manage().window().maximize();

//      3.Launch the application
		driver.get("https://demoqa.com/frames");

//      4.Locate elements
		WebElement mainWindowElement = driver.findElement(By.xpath("//h1[@class='text-center']"));
		WebElement element = driver.findElement(By.xpath("//div[text()='Elements']"));
		element.click();
		
		//switch to frame from main window
		driver.switchTo().frame("frame1");
		
		//locate frame element
		WebElement frameElement = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));

//      5.Print frame element text
		System.out.println(frameElement.getText());
		
		//switch back to main window
		driver.switchTo().defaultContent();
		
//      6.Print main window element text
		System.out.println(mainWindowElement.getText());
		
//      7.Close browser window
		driver.quit();

	}

}
