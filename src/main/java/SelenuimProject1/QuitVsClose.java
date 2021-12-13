package SelenuimProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\quality\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Launch Chrome
		driver.get("https://www.google.com/"); //launch url
		String title = driver.getTitle(); //get the title
		System.out.println("Page title is:" +title);
		//driver.close();
		driver.quit();
		 //driver = new ChromeDriver();
		System.out.println(driver.getTitle()); //NoSuchSessionException: invalid session id //See chrome on WINDOWS (null) when using quit
		//Session ID is null. Using WebDriver after calling quit()?
		//ChromeDriver driver1 = new ChromeDriver();
		
		
		
		
	}

}
