package SelenuimProject1;

public class AmazonTest {
	public static void main(String[] args) {
	BrowserUtil br = new BrowserUtil();
	br.launchBrowser("Chrome");
	br.enterurl("https://www.amazon.com/");
	String title = br.getPageTitle();
	System.out.println(title);
	if(title.contains("Amazon")) {
		System.out.println("Correct title");
	}
	else
		System.out.println("Wrong title");
	String url = br.getAppCurrenturl();
	System.out.println(url);
	br.closeBrowser();
}
}
