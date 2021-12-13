package SelenuimProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brutil = new BrowserUtil();
		WebDriver driver = brutil.launchBrowser("Chrome");
		brutil.enterurl("https://demo.opencart.com/index.php?route=account/register");
		String title = brutil.getPageTitle();
		System.out.println(title);
		
       By firstname = By.id("input-firstname");
       By lastname = By.id("input-lastname");
       By email = By.id("input-email");
       
		
		
		
		ElementUtil eutil = new ElementUtil(driver);
		eutil.doSendKeys(firstname, "Harrrry");
		eutil.doSendKeys(lastname, "Potter");
		eutil.doSendKeys(email, "test@gmail.com");
		
		Thread.sleep(5000);
		
		brutil.closeBrowser();
		
		

	}

}
