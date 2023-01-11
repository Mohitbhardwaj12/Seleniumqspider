package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollHorizontly {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Timeouts time = driver.manage().timeouts();
		time.implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://kwokyinmak.com/");
		Thread.sleep(2000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(2000,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-1000,0)");
		String title = js.executeScript("return document.title").toString();   //to get title
		System.out.println(title);

	}

}
