package MyTests;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	String name = "tom";
	@Test(expectedExceptions = Throwable.class)
	public void loginTest() {
		System.out.println("login.."); 
int a = 9/0;
		
		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
//		obj = null;
		System.out.println(obj.name);
	}
	
	
}
