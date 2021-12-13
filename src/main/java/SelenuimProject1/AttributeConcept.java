package SelenuimProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttributeConcept {
  
	
	static WebDriver driver;
	
	
	public static void  main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		//String hrefVal = driver.findElement(By.linkText("About Amazon")).getAttribute("href");
		//System.out.println(hrefVal);
		By AmazonLink = By.linkText("About Amazon");
		String hrefVal = getAttributeValue(AmazonLink, "href");
		if(hrefVal.contains("about")) {
			System.out.println("Correct href");
		}
		
		
	}
		
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
		public static String getAttributeValue(By locator,String attrName) {
			String attrVal = getElement(locator).getAttribute(attrName);
			System.out.println(attrVal);
			return attrVal;
	}

}
