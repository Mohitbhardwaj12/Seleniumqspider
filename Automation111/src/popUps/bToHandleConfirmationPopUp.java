package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class bToHandleConfirmationPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Timeouts time = driver.manage().timeouts();
		time.implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://demoqa.com/alerts");
	    WebElement alertheading = driver.findElement(By.xpath("//div[text()='Alerts']"));
		   JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",alertheading) ; 
		
	    driver.findElement(By.id("confirmButton")).click();
	    driver.switchTo().alert().dismiss();
	}

}
