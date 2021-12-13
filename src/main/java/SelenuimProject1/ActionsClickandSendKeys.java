package SelenuimProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickandSendKeys {

	
		static WebDriver driver;

		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			driver.get("https://classic.freecrm.com/register/");
			
			Actions act = new Actions(driver);
			
			WebElement firstname = driver.findElement(By.cssSelector("input[name='first_name']"));
			WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
			
			act.sendKeys(firstname, "xyzz").build().perform();
			act.sendKeys(email, "aaaaaaa@email.com").build().perform();
			

	}

}
