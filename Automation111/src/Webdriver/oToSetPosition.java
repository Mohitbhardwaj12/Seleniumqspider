package Webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class oToSetPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Point pos=new Point(500,500);
		driver.manage().window().setPosition(pos);
		
		Point pos1=new Point(100,200);
		driver.manage().window().setPosition(pos1);
		
		

	}

}
