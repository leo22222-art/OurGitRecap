package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.redfin.com/");
		
		Thread.sleep(3000);
		
		String expectedUrl = "https://www.redfin.com/";
		String actualUrl = driver.getCurrentUrl();
		
		if(expectedUrl.equalsIgnoreCase(actualUrl)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Filed");
			System.out.println("Expected Url:" + expectedUrl);
			System.out.println("Actual URL: " + actualUrl);

		}
		
		driver.quit();
	}

}
