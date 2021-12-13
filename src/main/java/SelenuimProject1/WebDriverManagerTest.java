package SelenuimProject1;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.iedriver().setup();
		
		
	}

}
