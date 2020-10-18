package org.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDemo {

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//initializing object of chromedriver class
		driver.get("http://wikipedia.org");
		driver.manage().window().maximize();
		
		
		
		WebElement element123 = driver.findElement(By.id("searchInput"));
		element123.sendKeys("India");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}

}
