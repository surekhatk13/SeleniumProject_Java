package MyTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	
	@BeforeMethod
	
	public void launchbrowser() {
		System.out.println("hi");
		int a = 9/0;
	}
	
	@Test
	
	public void CreateuserTest() {
		System.out.println("serach Test");
	
	
	}
	
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
//		int a = 9/0;
	}

	@Test(dependsOnMethods = {"loginTest","CreateuserTest"}, priority = 1)
	
	public void homeapageTest() {
		System.out.println("Home Page test");
	}
	
	@Test(dependsOnMethods = "loginTest", priority = 2)
	
	public void searchTest() {
		System.out.println("Search Test");
	}
}
