package SelenuimProject1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Relative {

	static WebDriver driver;

	public static void main(String[] args)  {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.whenwise.com/sign-in");
		
		
		driver.findElement(By.id("email")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@12345");
		driver.findElement(By.id("login-btn")).click();
		driver.findElement(By.xpath("//span[@class =\"avatar-status avatar-online\"]")).click();
		driver.navigate().to("https://www.whenwise.com/users/2835/edit");
		
		WebElement ele = driver.findElement(By.xpath("//span[text() ='Email on booking confirmation?']"));
		WebElement ele1 = driver.findElement(By.xpath("//span[text() ='Accept SMS appointment reminder?']"));
		
		driver.findElement(with(By.className("lever")).toRightOf(ele)).click();
		driver.findElement(with(By.className("lever")).near(ele1)).click();
}

}