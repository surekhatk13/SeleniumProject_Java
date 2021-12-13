package SelenuimProject1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	
		static WebDriver driver;
		public static void main(String[] args) {
			
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 driver.get("https://demo.opencart.com/index.php?route=account/login");
			By email = By.id("input-email");
			
           waitForElementPresentUsingFluentWait(email, 5, 2).sendKeys("test@test123.com");
           
	}

		
		
		public static WebElement waitForElementPresentUsingFluentWait(By locator, int Timeout, int pollingTime)

		{
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(Timeout)).pollingEvery(Duration.ofSeconds(pollingTime))
					 .ignoring(NoSuchElementException.class).withMessage("Element is not found....");
          WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return email_ele;
		}
		
		public static WebElement waitForElement(By locator,int timeout, int pollingTime) {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeout)).pollingEvery(Duration.ofSeconds(pollingTime))
					 .ignoring(NoSuchElementException.class).withMessage("Element is not found....");
         WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return email_ele;
		}









}


