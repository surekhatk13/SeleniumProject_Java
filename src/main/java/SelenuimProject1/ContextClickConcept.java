package SelenuimProject1;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClickConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClickMe = driver.findElement(By.xpath("//span[text()= 'right click me']"));
		Actions act = new Actions(driver);
         act.contextClick(rightClickMe).perform();
         List<WebElement>  rightClickoptions = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//li[contains(@class, 'context-menu-icon')]//span"));
            
         
         for(WebElement e: rightClickoptions) {
        	String text =  e.getText();
        	System.out.println(text);
        	Thread.sleep(5000);
        	if(text.equalsIgnoreCase("Edit")){
        		e.click();
        		String poptext = driver.switchTo().alert().getText();
        		System.out.println(poptext);
        		driver.switchTo().alert().accept();
//        		driver.s
//        		driver.switchTo().frame(driver.findElement(By.name("main")));
    			
    			//String headertext = driver.findElement(By.xpath("/html/body/h2")).getText();
    			//System.out.println(headertext);*/
        		break;
        	}
         }
         //ul[@class='context-menu-list context-menu-root']//li[contains(@class,'context-menu-icon')]/span")
       //ul[@class='context-menu-list context-menu-root']//li[contains(@class, 'context-menu-icon')]//span
	}

	
}
