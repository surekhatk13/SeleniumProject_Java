package SelenuimProject1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v93.browser.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreTable {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2021-22-1267897/australia-vs-pakistan-2nd-semi-final-1273755/full-scorecard");
		System.out.println(getWicketTakerName("Babar Azam"));
		System.out.println(getPlayerScoreCard("Asif Ali"));
		//Browser.close();
	}

	
	public static String getWicketTakerName(String playername)
	
	{
		
		String xpath = "//a[text() = '"+playername+"']/parent::td/following-sibling::td/span";
		return driver.findElement(By.xpath(xpath)).getText();
	
	}

	public static List<String> getPlayerScoreCard(String playername) {
		String xpath1 = "//a[text() = '"+playername+"']/parent::td/following-sibling::td";
		List<WebElement> scorelist =  driver.findElements(By.xpath(xpath1));
		List<String> scoreValList = new ArrayList<String>();
		for(int i=1;i<scorelist.size();i++) {
			String text = scorelist.get(i).getText();
			//System.out.println(text);
			scoreValList.add(text);
			
		}
	
	return scoreValList;
	}
	
	
}
