package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGenrateWindowIDUniquely {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
	   String winIDforGoogle=driver.getWindowHandle();
	   System.out.println("window id for google : "+winIDforGoogle);
	   
	   
	   WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.facebook.com/");
	   String windIDforFB=driver.getWindowHandle();
	   System.out.println("window id for facebook : "+windIDforFB);
	   
	}

}
