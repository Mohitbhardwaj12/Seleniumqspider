package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bToClear {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Q-spider/Selenium/DemoforXpath.html");
		WebElement aTextField = driver.findElement(By.xpath("//input[@value='a. ']"));
		aTextField.clear();
		Thread.sleep(2000);
		aTextField.sendKeys("Mohit");
		
		}

}
//"D:\Q-spider\Selenium\DemoforXpath.html"