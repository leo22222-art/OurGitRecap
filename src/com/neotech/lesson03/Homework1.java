package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
	
	public static final String url = "https://demo.guru99.com/test/newtours/";

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
		//first name
		driver.findElement(By.name("firstName")).sendKeys("Massinissa");
		//last name
		driver.findElement(By.name("lastName")).sendKeys("C.");
		//phone
		driver.findElement(By.name("phone")).sendKeys("123 456 78910");
		//email
		driver.findElement(By.id("userName")).sendKeys("neo@tech.com");
		
		//address 
		driver.findElement(By.name("address1")).sendKeys("Main St apt no2");
		
		//city
		driver.findElement(By.name("city")).sendKeys("NYC");
		
		//state
		driver.findElement(By.name("state")).sendKeys("New York");
		
		//postal code
		driver.findElement(By.name("postalCode")).sendKeys("43001");
		
		//username
		driver.findElement(By.id("email")).sendKeys("neo");
		
		//password
		driver.findElement(By.name("password")).sendKeys("neo@1234");


		
		




		
		Thread.sleep(5000);
		
		//click the submit button
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(5000);
		
		driver.quit();

		
	}

}
