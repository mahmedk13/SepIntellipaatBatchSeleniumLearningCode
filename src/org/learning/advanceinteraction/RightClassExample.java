package org.learning.advanceinteraction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClassExample {
	
	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//*[@id='authentication']/span"));
		
		
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement copy = driver.findElement(By.xpath("//*[@id='authentication']/ul/li[3]/span"));
		copy.click();
		
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		//alert.accept();
		
		
		
		
	}

}
