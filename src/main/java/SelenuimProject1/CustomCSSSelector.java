package SelenuimProject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCSSSelector {

	
		
		static WebDriver driver;

		public static void main(String[] args) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://demo.opencart.com/index.php?route=account/register");
			List<WebElement>  list = driver.findElements(By.cssSelector("input#input-firstname, input#input-lastname, input#input-email, input#input-confirm"));
             System.out.println(list.size());
             if(list.size() == 4) {
            	 System.out.println("pass");
             }
	}

}
