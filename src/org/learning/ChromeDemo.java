package org.learning;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo {

	public static void main(String[] args) {
		//tell the location of driver
		System.setProperty("webdriver.chrome.driver", "D:/personal/framework/SeleniumDemo/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//initializing object of chromedriver class
		driver.get("http://intellipaat.com");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
