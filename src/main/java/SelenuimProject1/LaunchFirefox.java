package SelenuimProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\quality\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); //Launch Chrome
		driver.get("https://www.google.com/"); //launch url
		String title = driver.getTitle(); //get the title
		System.out.println("Page title is:" +title);
		
		//Validation Checkpoint
		
		if(title.equals("Google")) {
			System.out.println("PASS");
			}
			else {
				System.out.println("FAIL");
		}
		
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();

	}

}
