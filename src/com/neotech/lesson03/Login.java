package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static final String url = "https://neotech.vercel.app/login";

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.id("uername")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		
		Thread.sleep(2000);
		

		
		

		
	}

}
