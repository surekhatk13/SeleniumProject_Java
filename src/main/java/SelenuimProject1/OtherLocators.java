package SelenuimProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OtherLocators {
   static WebDriver driver;
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();  
		
		//1 ---ID
		driver.get("https://demo.opencart.com/index.php?route=account/register");
//		driver.findElement(By.name("username")).sendKeys("test@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("test@123");
//		
		driver.findElement(By.id("input-firstname")).sendKeys("John");
		driver.findElement(By.name("lastname")).sendKeys("paul");
		
             By emailId = By.name("email");
//		By password = By.name("password");
//		
//		3 - classname
       ElementUtil eleutil = new ElementUtil(driver);
		eleutil.doSendKeys(emailId, "test@test123");
//		eleutil.doSendKeys(password, "test@123");
		
		//driver.findElement(By.className("form-control")).sendKeys("test@gmail.om");
		//driver.findElement(By.name("telephone")).sendKeys("12334244");
		
       By telephone = 	By.name("telephone");
       eleutil.doSendKeys(telephone, "124212344" );
       
       driver.findElement(By.id("input-password")).sendKeys("test@123");
       
       
       //driver.findElement(By.className("confirm")).sendKeys("test@123");
       
          By confirmPassword = By.name("confirm");
          eleutil.doSendKeys(confirmPassword, "test@123");
       
       //4 - Xpath
//		//*[@id="input-email"] ---Relative Xpath
		//*[@id="input-password"]
//		/html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input  ---Absolute Xpath --username
//		/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input -- Password
		
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("test@123");
//		
//		By emailId = By.xpath("//*[@id=\"input-email\"]");
//		By password = By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input");
//		eleutil.doSendKeys(emailId, "stest@gmail.com");
//		eleutil.doSendKeys(password, "test@123");
//		
//       //5.css Selector
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("test@123453");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("test@#@23");
//		
		
		//6.Link text
		//Only for links
		//driver.findElement(By.linkText("Register")).click();
//    By registerlink = By.linkText("Register");
//     doClick(registerlink);
       
//       String register = "Register";
//       eleutil.doClick("linktext", register);
//       
       //7.PartialtextLink:only for links
       //Partial text of the link
       //driver.findElement(By.partialLinkText("Information")).click();
       
       
       //8 Tagname:html tag
		/*
		 * String header = driver.findElement(By.tagName("h2")).getText();
		 * System.out.println(header); if(header.contains("New")) {
		 * System.out.println("header is correct");
		 */
	//}
//                By header =       By.tagName("h2");
//               if( doGetText(header).contains("New")) {
//            	   System.out.println("header is correct");
//               }
//	
	
	}
		
		public static WebElement getElement(By locator) {
			 return driver.findElement(locator);
			
		}
		
		public static void doClick(By locator) {
			getElement(locator).click();
		}
     
		
		public static String doGetText(By locator) {
              return getElement(locator).getText();
		}

}


