package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
	
	public static final String url = "https://facebook.com";

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(3000);
		
		//firstname
		driver.findElement(By.name("firstname")).sendKeys("Archif");
		
		//last name 
		driver.findElement(By.name("lastname")).sendKeys("A.");
		
		//email
		driver.findElement(By.name("reg_email__")).sendKeys("Archif@neo.com");
		
		//password
		driver.findElement(By.id("password_step_imput")).sendKeys("A123$$$$");
		
		Thread.sleep(5000);
		
		//submit
		driver.findElement(By.name("websubmit")).click();
		
		Thread.sleep(5000);
		
		
		



		

		
	}

}
