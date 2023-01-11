package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fToVerifySelected {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Q-spider/Selenium/demo.html");
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		boolean slected = checkbox.isSelected();
		if(slected)
		{
			System.out.println("pass the checkbox is selected");
			
		}
		
		else
			System.out.println("fail the checkbox is not slected");
			
	}

}
