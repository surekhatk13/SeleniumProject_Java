package SelenuimProject1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitforFrameConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		

		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://londonfreelance.org/courses/frames/index.html");
			
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("main"));
			waitForFrameByNameorId("main", 5);
			String header = driver.findElement(By.xpath("/html/body/h2")).getText();
			System.out.println(header);
			

	}
			public static void waitForFrameByNameorId(String nameorID, int timeout) {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(nameorID));
				
			}
			public static void waitForFrameByIndex(int FrameIndex, int timeout) {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameIndex));
				
			}
			public static void waitForFrameBylocator(By framelocator, int timeout) {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framelocator));
				
			}
			public static void waitForFrameByElement(WebElement frameElement, int timeout) {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
				
			}
			
			
			
			
			
			
			
	}


