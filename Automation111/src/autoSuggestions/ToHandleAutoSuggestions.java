package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("elon");
		Thread.sleep(2000);
		 List<WebElement> autosuggestions = driver.findElements(By.xpath("//span[contains(text(),'lon')]"));
		 System.out.println(autosuggestions); //address
		int noOfAutosuggestions = autosuggestions.size();
		System.out.println("number of autosuggestions is " +noOfAutosuggestions);
		for(WebElement suggestions : autosuggestions)
		{
			System.out.println(suggestions.getText());
		}
	}

}
