package SelenuimProject1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageCount {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		List<WebElement> imglist = driver.findElements(By.tagName("img"));
		
		System.out.println("The Total Number of Images:" +imglist.size());
		
	  
		//for each
		for(WebElement e :imglist) {
		String altValue = e.getAttribute("alt");
		String srcValue = e.getAttribute("src");
		System.out.println(altValue + " --->"+srcValue);	
		
		}
		
			

      
         
		}
		
		
		

	}


