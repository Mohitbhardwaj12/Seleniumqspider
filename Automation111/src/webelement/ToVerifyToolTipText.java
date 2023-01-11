package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyToolTipText {

	public static void main(String[] args) {
		String exepectedtipText = "keepLoggedInCheckBox";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	    String actualtiptext = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
		System.out.println(actualtiptext);
		if (actualtiptext.equals(actualtiptext))
		{
			System.out.println("pass: the tool tip is verified");
		}
		else
			System.out.println("fail: the tool tip is not verified");
		driver.quit();
	}

}
