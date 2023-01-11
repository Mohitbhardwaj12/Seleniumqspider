package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dVeriefyErrorMsg {

	public static void main(String[] args) {
		String expectederrormsg = "The email address or mobile";


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("login")).click();
		String actualErrorMsg=driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		if(actualErrorMsg.contains(expectederrormsg))
		{
			System.out.println("pass :the msg is verified ");
			
		}
		else
			System.out.println("fail : the error msg is not verified");
		driver.quit();

		
	}

}
