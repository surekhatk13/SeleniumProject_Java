package SelenuimProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchMicrosoftedge {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); //Launch Chrome
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


