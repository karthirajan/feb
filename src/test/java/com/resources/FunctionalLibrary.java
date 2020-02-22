package com.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalLibrary {
	public static WebDriver driver;
	
	public void launch(String url) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdul\\OneDrive\\Desktop\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);

	}
	
	public void insertText(WebElement element,String value) {
		
		element.sendKeys(value);

	}
	
	public void click(WebElement element) {
		
		element.click();

	}
	
	public WebElement findElement(String xpath) {
		
		 WebElement element = driver.findElement(By.xpath(xpath));
		return element;

	}
	

}
