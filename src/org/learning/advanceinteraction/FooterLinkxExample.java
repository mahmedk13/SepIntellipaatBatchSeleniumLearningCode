package org.learning.advanceinteraction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinkxExample {

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://wikipedia.org");
		driver.manage().window().maximize();
		
		//WebElement footer = driver.findElement(By.className("footer"));
		WebElement footer = driver.findElementByClassName("footer");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement e: links) {
			System.out.println("href value is "+e.getAttribute("href"));
		}
		
	
	}

}
