package SelenuimProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("alert('Hello!!!')");
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		String title = jsUtil.getTitleByJS();
		 System.out.println(title); 
		
		 //jsUtil.generateAlert("BlackFriday!");
//		 String innerText = jsUtil.getPageInnerText();
//		 System.out.println(innerText);
//		 System.out.println(innerText.contains("Talent Management"));
//		 jsUtil.refreshBrowserByJS();
		 
		WebElement Firstnametext = driver.findElement(By.xpath("//input[@name = 'first_name']"));
		WebElement surnametext = driver.findElement(By.xpath("//input[@name = 'surname']"));
		WebElement emailtext = driver.findElement(By.xpath("//input[@name = 'email']"));
		WebElement confirmemailtext = driver.findElement(By.xpath("//input[@name = 'email_confirm']"));
		WebElement usernametext = driver.findElement(By.xpath("//input[@name = 'username']"));
		WebElement passwordtext = driver.findElement(By.xpath("//input[@name = 'password']"));
		WebElement confirmpasswordtext = driver.findElement(By.xpath("//input[@name = 'passwordconfirm']"));
		WebElement agreetext = driver.findElement(By.xpath("//input[@name = 'agreeTerms']"));
		 
//		 jsUtil.flash(Firstnametext);
//		 Firstnametext.sendKeys("Tom");
//		 jsUtil.flash(surnametext);
//		 surnametext.sendKeys("Tom");
//		 jsUtil.flash(emailtext);
//		 emailtext.sendKeys("Tom@test.com");
//		 jsUtil.flash(confirmemailtext );
//		 confirmemailtext .sendKeys("Tom@test.com");
//		 jsUtil.flash(usernametext);
//		 usernametext.sendKeys("Tom");
//		 jsUtil.flash(passwordtext);
//		 passwordtext.sendKeys("Tom");
//		 jsUtil.flash( confirmpasswordtext);
//		 confirmpasswordtext.sendKeys("Tom");
//		 jsUtil.flash(agreetext);
//		 agreetext.click();
//		 
//		 WebElement image = driver.findElement(By.xpath("//img [@class = 'img-responsive']"));
//		 jsUtil.clickElementByJS(image);
//		 
//		
//		jsUtil.scrollPageDown();
//		Thread.sleep(2000);
//		jsUtil.scrollPageUp();
//		Thread.sleep(2000);
//		jsUtil.scrollPageDown("200");
		
		
		WebElement header = driver.findElement(By.id("submitButton"));
		jsUtil.scrollIntoView(header);
		System.out.println(header.getText());
	}

}
