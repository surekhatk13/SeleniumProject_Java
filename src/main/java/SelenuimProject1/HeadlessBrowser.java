package SelenuimProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {
		
	//Chrome 	
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		//co.addArguments("--headless");

		
				
		
		WebDriver driver = new ChromeDriver(co);
		
		//Firefox
		
//		WebDriverManager.firefoxdriver().setup();
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
//		
//		WebDriver driver = new FirefoxDriver(fo);
		
		//Edge
//		WebDriverManager.edgedriver().setup();
//		EdgeOptions eo = new EdgeOptions();
//		eo.addArguments("--incognito");
//		//eo.addArguments("--headless");
//		WebDriver driver = new EdgeDriver(eo);
//		
		
		driver.get("http://www.amazon.com");
		
		System.out.println(driver.getTitle());
    	System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getPageSource());

		driver.quit();

	}

}
