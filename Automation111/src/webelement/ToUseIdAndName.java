package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIdAndName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/rs817/OneDrive/Desktop/demo.html");
	WebElement	username=driver.findElement(By.id("123"));
		username.sendKeys("class khatam");
		WebElement password = driver.findElement(By.id("345"));
		password.sendKeys("there is no class");
		
	}

}

