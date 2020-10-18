package org.learning.advanceinteraction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		WebElement tryitBtn = driver.findElementByXPath("//button[text()='Try it']");
		tryitBtn.click();
		
//		driver.switchTo().defaultContent();
//		WebElement homeBtn = driver.findElementById("tryhome");
//		homeBtn.click();
		
		//driver.switchTo().frame(1);
		
		
		driver.switchTo().defaultContent();
		List<WebElement> frames = driver.findElementsByTagName("iframe");
		System.out.println(frames.size());
		
		for(WebElement f: frames) {
			System.out.println("id of the frame is "+f.getAttribute("id")+" and name of the frame is "+f.getAttribute("name"));
		}
		
		
		
		
		
		
		
		
	}	
}
