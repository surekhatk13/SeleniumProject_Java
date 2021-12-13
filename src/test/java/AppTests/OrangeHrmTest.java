package AppTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHrmTest extends BaseTest {

	@Test
	public void contactsalesTest() {
	//driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		boolean flag = driver.findElement(By.linkText("CONTACT SALES")).isDisplayed();
		Assert.assertTrue(flag); 
//		int a = 9/0;
	}
	
	@Test
	
	public void urlTest() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("orangehrm"));
	}


}



