package SelenuimProject1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.*; 


public class RelativeLocators {

	
		
		static WebDriver driver;

		public static void main(String[] args)  {
			
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.aqi.in/dashboard/india");
			
			WebElement ele = driver.findElement(By.xpath("//a[text() ='New-Delhi, India']"));
			
			String text1 = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
			String text = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
			String text2 = driver.findElement(with(By.tagName("p")).below(ele)).getText();
			String text3 = driver.findElement(with(By.tagName("p")).above(ele)).getText();
			System.out.println(text);
			System.out.println(text1);
			System.out.println(text2);
			System.out.println(text3);
			
			
	}

}
