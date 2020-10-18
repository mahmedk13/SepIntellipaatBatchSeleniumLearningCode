package org.learning.advanceinteraction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassExample {

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://wikipedia.org");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		Select sel = new Select(dropdown);
		
		//List<WebElement> list = sel.getOptions();
		
		List<WebElement> list = driver.findElements(By.tagName("option"));
		
		List<String> ddvalues = new ArrayList<String>();
		
		
		
		//System.out.println(ddvalues);
		
		//sel.selectByIndex(2);
		//sel.selectByValue("cy");
		//sel.selectByVisibleText("English");
		
		
		List<String> list1 =list.stream().map(e->e.getText()).collect(Collectors.toList());
		System.out.println(list1);
		//list.stream().filter(e->e.getText().contains("a")).forEach(e->System.out.println(e.getText()));
		
		

	}

}
