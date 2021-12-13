package SelenuimProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v93.browser.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTableHandle {

  static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.w3schools.com/html/html_tables.asp");
		
	    //table[@id="customers"] ---
	    //*[@id="customers"]
	    
           ////table[@id="customers"]/tbody/tr[2]/td[1]
	    ////table[@id="customers"]/tbody/tr[3]/td[1]
	    ////table[@id="customers"]/tbody/tr[7]/td[1]
	    
//	    String beforeXpath = "//table[@id=\"customers\"]/tbody/tr[";
//	    String afterXpath = "]/td[1]";
//	    
	  
	    
	    
//	    for (int i = 2; i<=rowCount ; i++) {
//	    	String Companyxpath = beforeXpath+i+afterXpath;
//	    	System.out.println(Companyxpath);
//	    	String Comptext = driver.findElement(By.xpath(Companyxpath)).getText();
//	    	System.out.println(Comptext);
//	    }
	    By row = By.xpath("//table[@id=\"customers\"]/tbody/tr");
	    By col = By.xpath("//table[@id=\"customers\"]/tbody/tr[1]/th");
	    String beforeXpath = "//table[@id='customers']/tbody/tr[";
	    String afterXpath = "]/td[";
	    printTable(row, col,beforeXpath, afterXpath);
	    
	}

	
	public static void printTable(By rowLocator , By colLocator, String beforeXpath, String afterXpath) {
		  int rowCount =  driver.findElements(rowLocator).size();
		  
			 //*[@id="customers"]/tbody/tr[1]/th
			   int colCount = driver.findElements(colLocator).size();
			   for (int row = 2; row<=rowCount ; row++) {
				   for (int col =1 ;col<= colCount; col++){
					  
					String xpath =  beforeXpath+row+afterXpath+col+"]";
					String text = driver.findElement(By.xpath(xpath)).getText();
					System.out.print(text+"           |                ");
				   }
					System.out.println();
					   
				   }
			   
	//Browser.close();
	}
	}

