package SelenuimProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		//Create the webelement and perform actions(click,senkeys,gettext, isdisplayed,isenabled)
		
		
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.getCurrentUrl();
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		
		//2nd
		
//	WebElement email = driver.findElement(By.id("input-email"));
//	WebElement password = driver.findElement(By.id("input-password"));
//	
//	email.sendKeys("test@gmail.com");
//	password.sendKeys("test@123");
//	
	
	//3
//	
//	By username = By.id("input-email");
//	By password = By.id("input-password");
//	
//	driver.findElement(username).sendKeys("test@gmail.com");
//	driver.findElement(password).sendKeys("test@123");
//	
		
		
		//4:By method with generic method
//		By username = By.id("input-email");
//     	By password = By.id("input-password");
//		
//	    getElement(username).sendKeys("test@gmail.com");
//	    getElement(password).sendKeys("test@123");
//     	
		//5.By locator with generic method (getElement() with action methods)
//	    By username = By.id("input-email");
//	    By password = By.id("input-password");
//	   doSendKeys(username, "test@gmail.com");
//	   doSendKeys(password, "test@123");
		
	   
//	   //6.ElementUtil class with generic methods
//		By username = By.id("input-email");
//	    By password = By.id("input-password");
//	   
//	    ElementUtil eleUtil = new ElementUtil(driver);
//	    eleUtil.doSendKeys(username, "test678@gmail.com");
//	    eleUtil.doSendKeys(password, "test@123");
	    
		
		//7.String Locators
		
		String UsernameID = "input-email";
		String passwordID = "input-password";
		
		doSendKeys("id", UsernameID, "test@gmail.com");
		doSendKeys("id", passwordID, "test@123");
	}
	
	public static By getBy(String locatorType, String locatorValue) {
		By locator = null;

		switch (locatorType.toLowerCase()) {
		case "id":
			locator = By.id(locatorValue);
			break;

		default:
			System.out.println("please pass the right locator type and value.....");
			break;
		}

		return locator;

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static WebElement getElement(String locatorType, String locatorValue) {
		return driver.findElement(getBy(locatorType, locatorValue));
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doSendKeys(String locatorType, String locatorValue, String value) {
		getElement(locatorType, locatorValue).sendKeys(value);
	}

}



