package SelenuimProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class CrossBrowserTest {
             static  WebDriver driver;
	public static void main(String[] args) {
		
		String browser = "edge";
		
		if(browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			// We have used the above line because we have WDM to take care  System.setProperty("webdriver.gecko.driver", "C:\\Users\\quality\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else if (browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			//System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
			 driver = new EdgeDriver();
	}
		else {
			System.out.println("Please pass the right browser..." +browser);
		}
		driver.get("https://www.amazon.com//"); //launch url
		
		String title = driver.getTitle(); //get the title
		System.out.println("Page title is:" +title);
		
		//Validation Checkpoint
		
		if(title.contains("Amazon")) {
			System.out.println("PASS");
			}
			else {
				System.out.println("FAIL");
		}
		
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
}
	
}
