package SelenuimProject1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickWhenReadyConcept {
 static WebDriver driver;
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		By footer = By.linkText("Careers");
		
		clickElementWhenReady(footer, 5);

	}
	
	public static void clickElementWhenReady(By locator, int timeout) {

		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
		
	}

}
