package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignment {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Q-spider/Selenium/demo.html");
		Point usernameloc = driver.findElement(By.id("123")).getLocation();
		System.out.println(usernameloc);
		int usernameStartX = usernameloc.getX();
	   Point passwordloc = driver.findElement(By.id("345")).getLocation();
	   System.out.println(passwordloc);
	  int passwordStartX = passwordloc.getX();
	  System.out.println("the start x of username is " +usernameStartX);
	  System.out.println("the start x of password is "+passwordStartX);
	  if(usernameStartX == passwordStartX)
	  {
		  System.out.println("pass: the allignment is verified ");
	  }
	  else
		  System.out.println("fail : the allignment is not verifeid");
		

	}

}
