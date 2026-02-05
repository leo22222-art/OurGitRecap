package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroweserCommands {

	public static void main(String[] args) throws InterruptedException {
//1. open chrome browser
		WebDriver driver = new ChromeDriver();
		
		//2. use the .navigate().to() method
		driver.navigate().to("https://www.zillow.com/");
		
		Thread.sleep(4000);
		
		//3. Navigate to "https://google.com/"
		driver.navigate().to("https://www.google.com");
		
		Thread.sleep(3000);
		
		//4. Navigate back to Zillow Page
		driver.navigate().back();
		Thread.sleep(3000);
		
		//5. 	Refresh current page
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//6. Verify url contains "Zillow"
		String url = driver.getCurrentUrl();
		if (url.contains("zillow")) {
			System.out.println("Test Passed");
		}else { 
			System.out.println("Test Failed!");
			System.out.println("Current url: " + url);
		}
		
		driver.quit();
		
		
		
		
	}

}
