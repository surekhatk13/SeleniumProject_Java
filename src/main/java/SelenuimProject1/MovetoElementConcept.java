package SelenuimProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovetoElementConcept {

	
		static WebDriver driver;

		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
//			WebElement parentele = driver.findElement(By.cssSelector("a.menulink"));
//			
//			Actions act = new Actions(driver);
//			act.moveToElement(parentele).perform();
//			driver.findElement(By.linkText("ARTICLES")).click();
			By parentMenuLocator = By.cssSelector("a.menulink");
			By childMenuLocator = By.linkText("ARTICLES");
			doClickonChildMenu(parentMenuLocator, childMenuLocator);
	}
		
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
		
		public static void doMoveToElement(By locator) {
			Actions act = new Actions(driver);
			act.moveToElement(getElement(locator)).perform();
		}

		public static void doClickonChildMenu(By parentMenuLocator, By childMenuLocator) {
			doMoveToElement(parentMenuLocator);
			getElement(childMenuLocator).click();
		}
		
}
