package SelenuimProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassicCrmFrameHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://classic.freecrm.com/index.html");
		
	    driver.findElement(By.name("username")).sendKeys("groupautomation");
	    driver.findElement(By.name("password")).sendKeys("Test@12345");
	    driver.findElement(By.className("input-group-btn")).click();

	    Thread.sleep(5000);
	    
	    driver.switchTo().frame("mainpanel");
	    
	    driver.findElement(By.linkText("CONTACTS")).click();
	    driver.switchTo().defaultContent();
	}

}
