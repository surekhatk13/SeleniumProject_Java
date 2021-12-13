package SelenuimProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\quality\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Launch Chrome
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
