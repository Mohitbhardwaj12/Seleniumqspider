package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignment1 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Q-spider/Selenium/demo1.html");
		Point usernameloc = driver.findElement(By.id("123")).getLocation();
		System.out.println(usernameloc);
		int usernameStartY = usernameloc.getY();
	   Point passwordloc = driver.findElement(By.id("345")).getLocation();
	   System.out.println(passwordloc);
	  int passwordStartY = passwordloc.getY();
	  System.out.println("the start y of username is " +usernameStartY);
	  System.out.println("the start y of password is "+passwordStartY);
	  if(usernameStartY == passwordStartY)
	  {
		  System.out.println("pass: the allignment is verified ");
	  }
	  else
		  System.out.println("fail : the allignment is not verifeid");
		

	}


	}


