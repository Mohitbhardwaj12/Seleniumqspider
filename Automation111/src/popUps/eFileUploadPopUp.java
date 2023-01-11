package popUps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class eFileUploadPopUp {

	public static void main(String[] args) throws IOException {

          System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
          WebDriver driver=new ChromeDriver();
  		driver.manage().window().maximize();
  		Timeouts time = driver.manage().timeouts();
  		time.implicitlyWait(20, TimeUnit.SECONDS);
  	    driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
  	    driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
  	    Runtime.getRuntime().exec("./autoIt/Fileupload.exe");
  	    
          
	}

}
