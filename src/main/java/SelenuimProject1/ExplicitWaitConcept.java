package SelenuimProject1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
         driver.get("https://www.amazon.com/");		
         
         By search = By.id("twotabsearchtextbox");
         By logo_ele = By.cssSelector("#nav-logo-sprites");
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement search_ele =  wait.until(ExpectedConditions.presenceOfElementLocated(search));
         search_ele.sendKeys("books");
         driver.findElement(logo_ele).click();
         
         
 
	}

}
