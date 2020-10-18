package org.learning.advanceinteraction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {
	
	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		driver.manage().window().maximize();
		
		WebElement bar = driver.findElement(By.id("slider"));
		double width = bar.getSize().width/1.2;
		
		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));

		
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(slider, (int) width, 0).perform();
		
		
		
		
		
	}

}
