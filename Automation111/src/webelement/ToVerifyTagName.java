package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTagName {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernameTextField = driver.findElement(By.id("username"));
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		WebElement LoginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
		String usernameTagName = usernameTextField.getTagName();
		String passwordTagName = passwordTextField.getTagName();
		String loginTagName = LoginButton.getTagName();
		if (usernameTagName.equals("input") && passwordTagName.equals("input") && loginTagName.equals("div"))
		{
			usernameTextField.sendKeys("admin");
			passwordTextField.sendKeys("manager");
			Thread.sleep(2000);
			LoginButton.click();
			System.out.println("pass the tag name is verified");
			
		}
		else
			System.out.println(" tag name  is invalid");
		
	}

}
