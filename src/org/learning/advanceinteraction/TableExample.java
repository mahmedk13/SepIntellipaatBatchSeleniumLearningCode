package org.learning.advanceinteraction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElementByXPath("//table[@class='dataTable']");
		
		List<WebElement> headers = table.findElements(By.tagName("th"));
		
//		for(int i =1; i<=headers.size(); i++) {
//			System.out.println("Num of headers in the table are "+headers.size());
//			System.out.println("text of the header "+i+" is "+headers.get(i-1).getText());
//		}
//		
//		//List<WebElement> rows = driver.findElementsByXPath("//table[@class='dataTable']//tr");
//		
//		for(int i =1; i<=rows.size(); i++) {
//			System.out.println("Num of rows in the table are "+rows.size());
//			System.out.println("text of the row "+i+" is"+rows.get(i-1).getText());
//		}
//	}
		
		//List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		List<WebElement> rows = driver.findElementsByXPath("//table[@class='dataTable']//tbody//tr");

	
	
	for(int i=1; i<=rows.size(); i++) {
		
		for(int j=1; j<=headers.size(); j++) {
			////table[@class='dataTable']//tr[1]//td[1]
			// tr[1]//td[2]
			//tr[1]//td[3]
			//tr[1]//td[4]
			//tr[1]//td[5]
			
			//tr[2]//td[1]
			//tr[2]//td[2]
			
			WebElement element = driver.findElementByXPath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]");
			System.out.println("text of the row "+i+" and cell "+j+" is "+element.getText());
		
		}
		
	}

	}
}
