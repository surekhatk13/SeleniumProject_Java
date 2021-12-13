package SelenuimProject1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://classic.freecrm.com/index.html");
		
	    driver.findElement(By.name("username")).sendKeys("groupautomation");
	    driver.findElement(By.name("password")).sendKeys("Test@12345");
	    driver.findElement(By.className("input-group-btn")).click();

	    Thread.sleep(5000);
	    
        driver.switchTo().frame("mainpanel");
	    
	    driver.findElement(By.linkText("CONTACTS")).click();
	    
	    selectcontact("deepti Gupta");
	    selectcontact("David Chris");
	    //selectcontact("Amar3 Singh3");
	    
	    System.out.println(getCompanyName("Amar3 Singh3"));	 
	    System.out.println(getcontactphoneList("Amar3 Singh3"));
	    
	    
	    ////a[text() = 'deepti Gupta']/parent::td/preceding-sibling::td/input
	    ////a[text() = 'David Chris']/parent::td/preceding-sibling::td/input
	    ////a[text() = 'contact1 contactlname']/../preceding-sibling::td/input
	    ////a[text() = 'contact1 contactlname']/../preceding-sibling::td/child::input
	    
	    //
	    
   //String xpath1 = 	  "//a[text() = 'deepti Gupta']/parent::td/preceding-sibling::td/input";
   //String xpath2 = "//a[text() = 'David Chris']/parent::td/preceding-sibling::td/input";
	    
	    //driver.findElement(By.xpath(xpath1)).click();
	   // driver.findElement(By.xpath(xpath2)).click();
	    
	}
	    public static void selectcontact(String contactname) {
	    	String xpath1 = 	  "//a[text() = '"+contactname+"']/parent::td/preceding-sibling::td/input";
	    	driver.findElement(By.xpath(xpath1)).click();
	    }
	    
	    
	    public static String getCompanyName(String contactname) {
	    	//String xpath = "//a[text()='"+contactName+"']//parent::td//following-sibling::td/a[@context='company']";
	    	String xpath2 = "//a[text() ='"+contactname+"']//parent::td//following-sibling::td/a[@context = 'company']";
	    	return driver.findElement(By.xpath(xpath2)).getText();
	    //	return driver.findElement(By.xpath(xpath)).getText();

	    }
	    
	    
	    ////a[text= 'Amar3 Singh3']//parent::td//forward_sibling::td/span[@context = 'phone']
	    
	    public static List<String> getcontactphoneList(String contactname) {
	    	String xpath3 = "//a[text()= '"+contactname+"']//parent::td//following-sibling::td/span[@context = 'phone']";
	    	List<WebElement> phonelist =  driver.findElements(By.xpath(xpath3));
	    	List<String> phonevalList = new ArrayList<String>();
	    	for(WebElement e : phonelist) {
	    		String text = e.getText();
	    		phonevalList.add(text);
	    	}
	    	
	    	return phonevalList;
	    	
	    }
}




