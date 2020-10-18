package org.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDemo {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", path+"/drivers/geckodriver.exe");
		
		String browserName="firefox";
		WebDriver driver;
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			
		}else { 
			driver = new FirefoxDriver();
			
		}
		
			driver.get("http://google.com");
	


	}

}
