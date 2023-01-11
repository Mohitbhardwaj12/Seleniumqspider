package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassD {

	@Test
	public void Demo2() {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
       new ChromeDriver();
	
	
	}
}
