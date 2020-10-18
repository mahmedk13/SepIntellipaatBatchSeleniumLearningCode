package org.learning.advanceinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://guru99.com");
		driver.manage().window().maximize();
		WebElement testing = driver.findElement(By.xpath("//*[@id=\"menu-3688-particle\"]/nav/ul/li[2]/div/span[1]/span"));
		 //how to perform mousehover on testing element
		//Actions class
		
		Actions act = new Actions(driver);
		act.moveToElement(testing).perform();
		
		
		
	}

}
