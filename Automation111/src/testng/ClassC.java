package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassC {
	
	@Test
	public void Demo1() {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
       new ChromeDriver();
	
	
	}
	

}
