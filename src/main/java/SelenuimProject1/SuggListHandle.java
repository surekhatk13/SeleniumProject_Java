package SelenuimProject1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggListHandle {
  
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		//driver.get("http://automationpractice.com/index.php");
		driver.get("https://www.google.com/");
		//driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		driver.findElement(By.name("q")).sendKeys("pfizer");
		
		Thread.sleep(5000);
		
		selectFromSugglist("booster");
		
		//driver.findElement(By.xpath("//div[@class='ac_results']//li[contains(text(),'Evening Dresses > Printed ')]")).click();
		
//		for(WebElement e: suggList)
//		{
//			String text = e.getText();
//			if(text.contains("Evening Dresses "))
//			{
//				e.click();
//				break;
//			}
	}
		public static void selectFromSugglist( String value) {
			//driver.findElement(By.xpath("//div[@class='ac_results']//li[contains(text(),'"+value+"')]")).click();
			driver.findElement(By.xpath("//div[@class='RNNXgb']//li[contains(text(),'"+value+"')]")).click();
			
			
		}
		
		}
		
		
		
		
		
		

	


