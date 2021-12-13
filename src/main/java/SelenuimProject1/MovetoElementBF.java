package SelenuimProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovetoElementBF {

	
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			driver.get("https://blackfriday.com/");
   //WebElement parentele = driver.findElement(By.cssSelector("span>a[href=\"/ads\"]"));
//			//WebElement parentele = driver.findElement(By.cssSelector("a.menulink"));
//			Actions act = new Actions(driver);
//			
//			act.moveToElement(parentele).build().perform();
			
			//By parentMenuLocator = By.cssSelector("a.menulink");
			By parentMenuLocator = By.cssSelector("span>a[href=\"/ads\"]");
			By childMenuLocator = By.cssSelector("li>a[href=\"/target-black-friday\"]");
			doClickonChildMenu(parentMenuLocator, childMenuLocator);
	}
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
		
		public static void doMoveToElement(By locator) {
			Actions act = new Actions(driver);
			act.moveToElement(getElement(locator)).perform();
		}

		public static void doClickonChildMenu(By parentMenuLocator, By childMenuLocator) throws InterruptedException {
			doMoveToElement(parentMenuLocator);
			Thread.sleep(3000);
			getElement(childMenuLocator).click();
		}
		
}
