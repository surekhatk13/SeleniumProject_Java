package SelenuimProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	public WebDriver driver;
/**
 * This method is used to launch the browser based on the given browser name 	
 * @param browser
 * @return
 */
	public WebDriver launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\quality\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\quality\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
			 driver = new EdgeDriver();
	}
		else {
			System.out.println("Please pass the right browser..." +browser);
		}
		
		return driver;
	}
		public void enterurl(String url) {
			if(url==null) {
				System.out.println("url is null");
				return;
			}
			if(url.indexOf("http")==-1) {
				System.out.println("http is missing");
				return;
			}
		driver.get(url);
	}
		
		public String getAppCurrenturl() {
			return driver.getCurrentUrl();
		}
		
		public String getPageTitle() {
			return driver.getTitle();
		}
	
		public void closeBrowser() {
			driver.close();
		}
	public void quitBroswer() {
		driver.quit();
	}
}
