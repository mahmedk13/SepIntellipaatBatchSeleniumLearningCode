package org.learning.advanceinteraction;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultileTabsExample {

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tag_frame.asp");
		driver.manage().window().maximize();
		
		WebElement tryItUrselfBtn = driver.findElementByXPath("//a[text()='Try it Yourself »']");
		tryItUrselfBtn.click();
		
		Set<String> tabs = driver.getWindowHandles();
		System.out.println(tabs.size());
		
		Iterator<String> itr = tabs.iterator();
		String firstTab= itr.next();
		System.out.println("window id of first tab is "+firstTab);
		String secondTab = itr.next();
		System.out.println("window id of second tab is "+secondTab);
		
		driver.switchTo().window(secondTab);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());	
		driver.switchTo().frame("iframeResult");
		WebElement frame = driver.findElementByXPath("//iframe[@title='W3Schools Free Online Web Tutorials']");
		driver.switchTo().frame(frame);
		WebElement search = driver.findElementByCssSelector("a[title='Search W3Schools']");
		search.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		driver.switchTo().window(firstTab);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

		
	}	
}
