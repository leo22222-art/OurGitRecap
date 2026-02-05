package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		
		//locate the email textbox
		
		//create a WebElement object
		WebElement emailBox = driver.findElement(By.name("email"));
		
		emailBox.sendKeys("neo@tech.com");
		
		Thread.sleep(2000);
		
		//locate password box
		
		WebElement passwordBox = driver.findElement(By.name("pass"));
		
		
		
	}

}
