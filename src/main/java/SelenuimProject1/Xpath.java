package SelenuimProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//xpath
		////htmltag[@attribute = 'value']
		//a[ @href=\"https://www.amazon.jobs\"]
		
		//2.//htmltag[@attr ='value' and @attr = 'value']
		//driver.findElement(By.xpath("//a[@class = 'nav_a' and  @href=\"https://www.amazon.jobs\"]")).click();
		
         //3.//htmltag[text() = 'value']  text is a func in xpath
		
		//driver.findElement(By.xpath("//a[text() = 'About Amazon'] ")).click();
		
		//driver.findElement(By.xpath("//a[text() = 'Best Sellers' and @href =\"/gp/bestsellers/?ref_=nav_cs_bestsellers_8a080d3d7b55497ea1bdd97b7cff8b7b\"] ")).click();
	
		//driver.findElement(By.xpath("//span[contains(@id ,'glow-ingress-line2')]")).click();
		//driver.findElement(By.xpath("//div[contains(@class ,'nav-logo-base nav-sprite')]")).click();
		//driver.findElement(By.xpath("//h2[contains(text() ,'Deals in magazine subscriptions')]"));
		
		
		//2 attributes with and without contains
		
		//htmltag[contains(@attr1,'value') and (@attr2 = 'value')]
driver.findElement(By.xpath("//a[contains(@id,'icp-touch-link-language') and (@class = 'icp-button')]")).click();
        
//htmltag[starts-with(@attr , value)]
driver.findElement(By.xpath("//span[ @id = 'icp-sl-t-hint' ]")).click();;

Thread.sleep(5000);
driver.findElement(By.xpath("//input[@class = 'a-button-input']")).click();
driver.findElement(By.xpath("(//a[@class = 'nav-a  '])[3]")).click();
driver.findElement(By.xpath("((//div[@class = 'navFooterColHead'])[2]//li)[last()]")).click();


	}

}
