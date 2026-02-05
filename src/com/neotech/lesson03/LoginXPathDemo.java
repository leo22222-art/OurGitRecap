package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginXPathDemo {
	
	public static final String url = "https://neotech.vercel.app/login";

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
	//	driver.findElement(By.xpath("/html/body/div[2]/main/div/div[1]/"))
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");

}
}
