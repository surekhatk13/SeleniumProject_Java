package SelenuimProject1;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomWait {
 static WebDriver driver;
	public static void main(String[] args) {
		

	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	
	public static WebElement retryingElement(By locator, int timeOut) {
		WebElement element = null;
		int attempts = 0;
		while (attempts < timeOut) {
			try {
				element = getElement(locator);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("element is not found in attempt: " + attempts + " : " + locator);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			attempts++;
		}
		
		return element;
	}
}