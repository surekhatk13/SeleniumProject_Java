package SelenuimProject1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksTextUtil {
   static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		By images = By.tagName("a");
		System.out.println(getElementsCount(images));
		
		List<String>  actlist = getElementsTextList(images);
		for(String e:actlist) {
			System.out.println(e); 
			
		}
		
	}
	
	
	
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> elelist =	getElements(locator);
		List<String> eleTextlist = new ArrayList<String>();
		for(WebElement e: elelist) {
			String eleText = e.getText();
			if(!elelist.isEmpty()) {
				e.getText();
				eleTextlist.add(eleText);
			}
		}
	return eleTextlist;
	
	}
	
	
		public static int getElementsCount(By locator) {
			return getElements(locator).size();
					
		}
		
		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		}
		

	}


