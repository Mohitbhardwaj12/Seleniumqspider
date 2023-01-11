package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dToHandleHiddenDivisionPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Timeouts time = driver.manage().timeouts();
		time.implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.flipkart.com/");
	   // driver.findElement(By.xpath("//button[text()='✕']")).click();
	   Actions action = new  Actions(driver);
	   action.moveByOffset(100, 200).click().perform();
	   
	    
	    
	}

}
