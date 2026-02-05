package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxBrowser {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		//2S
		driver.get("http://www.neotechacademy.com/");
		
		Thread.sleep(2000);
	}

}
