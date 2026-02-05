package com.neotech.lesson02;

import java.util.Scanner;

public class TestWebDriver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Which browser to use?");
		String browser = scan.next();
		
		if(browser.equals("chrome")) {
			driver = new C_ChromeDriver();

		 C_ChromeDriver driver = new C_ChromeDriver();
		 
		 driver.get("https://google.com");
		 
		 driver.getTitle();
		 
		 driver.getCurrentUrl();
		 
		 driver.quit();
	} else if (browser.equals("Firefox")) {
		driver = new C_FirefoxDriver();
	}else { 
		System.out.println("No such broweser, I will use chromw instead");
		driver
	}
		
		 
		 
	}

}
