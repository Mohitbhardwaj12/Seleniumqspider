package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyOverlaping {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Q-spider/Selenium/demo.html");
		  Rectangle usernameRect = driver.findElement(By.id("123")).getRect();
		  Rectangle passwordRect = driver.findElement(By.id("345")).getRect();
		 int usernameEndY = usernameRect.getY() + usernameRect.getHeight();
		  int passwordStartY = passwordRect.getY();
		 System.out.println(usernameEndY);
		 System.out.println(passwordStartY);
		 
		if(passwordStartY >= usernameEndY)
		{
			System.out.println("paas:text field is not overlaping");
			
		}
		else
			System.out.println("Fail: text field is overlaping");
		driver.quit()
	}

}
