package org.learning.advanceinteraction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitProblem {
	
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		WebElement source = driver.findElementById("FromSector_show");
		source.clear();
		source.sendKeys("Bangalore(BLR)", Keys.ENTER);
		
		WebElement destination = driver.findElementById("Editbox13_show");
		destination.clear();
		destination.sendKeys("Chennai", Keys.ENTER);
		
		WebElement calendarBtn = driver.findElementById("ddate");
		calendarBtn.click();
		
		WebElement date = driver.findElementById("frth_2_20/10/2020");
		date.click();
		
		WebElement searchBtn = driver.findElementByClassName("src_btn");
		searchBtn.click();
		
		WebElement bookNow = driver.findElementByXPath("//button[text()='Book Now1']");
		bookNow.click();
		
		//9 elements--> 4*9 -->36 seconds wasted for 1 test case, 36 seconds *100 --> 3600/60--60 mins --1
	}

}
