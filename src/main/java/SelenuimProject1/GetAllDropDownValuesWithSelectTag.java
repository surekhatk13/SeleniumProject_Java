package SelenuimProject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllDropDownValuesWithSelectTag {

	
		static WebDriver driver;

		public static void main(String[] args) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
			
           WebElement  Country = driver.findElement(By.id("Form_submitForm_Country"));
           
           Select select = new Select(Country);
           List<WebElement>  CountryList = select.getOptions();
           System.out.println(CountryList.size()); 
           if(CountryList.size()-1 == 231) {
        	   System.out.println("Country count is right");
           }
           
           
//           int count = 1;
//           for(WebElement e :CountryList)
//           {
//        	  String CountryListtext =  e.getText();
//        	  System.out.println(count +"::"+CountryListtext);
//        	  count++;
//           
//        	   
//           }
//           
// 
           for(int i = 1; i<CountryList.size();i++) {
        	   String text = CountryList.get(i).getText();
        	   System.out.println(i+"::"+text);
        	   
           }
           
	}

}
