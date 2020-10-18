package org.learning.advanceinteraction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsExample {

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		
		List<WebElement> checkboxes = driver.findElementsByXPath("//input[@type='checkbox'][@name='sports']");
		
		//checkboxes.get(1).click();
		
		for(WebElement ele: checkboxes) {
//			if(!ele.isSelected()){; //true--> false, false-->true
//			ele.click();
//			}
			
			
			System.out.println(ele.getAttribute("value"));
			//System.out.println(ele.isDisplayed());
			
		}
		
		
		
		
		
	
	}

}
