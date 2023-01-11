package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hToQuite {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	Thread.sleep(2000);
	driver.quit();
	}

}
