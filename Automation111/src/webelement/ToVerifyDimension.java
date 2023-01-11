package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Q-spider/Selenium/demo.html");
		Dimension usernamedim = driver.findElement(By.id("123")).getSize();
		System.out.println(usernamedim);
		int usernameheight = usernamedim.getHeight();
		int usernamewidth = usernamedim.getWidth();
		Dimension passworddim = driver.findElement(By.id("345")).getSize();
		System.out.println(passworddim);
		int passwordheight = passworddim.getHeight();
		int passwordwidth = passworddim.getWidth();
		if(usernameheight==passwordheight && usernamewidth==passwordwidth)
		{
			System.out.println("pass the dimension is verified");
		}
		else
			System.out.println("fail the dimension is not verified");
		
	}

}
