package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cToHandlePromptPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Timeouts time = driver.manage().timeouts();
		time.implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://demoqa.com/alerts");
	    
	   WebElement alertheading = driver.findElement(By.id("promtButton"));
	   JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",alertheading) ; 
		
	    driver.findElement(By.id("promtButton")).click();
	    Alert alert = driver.switchTo().alert();
		 
	   String alerttext = alert.getText();
	  alert.sendKeys("Ankita Gosain");
	  System.out.println(alerttext);
	  alert.accept();
	
	}
}
