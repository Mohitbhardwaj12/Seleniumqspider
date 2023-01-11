package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAltTextofImage {

	public static void main(String[] args) {

		String exepectedAltText = "Flipkart";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String actualAlttext = driver.findElement(By.xpath("//img[@class='_2xm1JU']")).getAttribute("alt");
	    System.out.println(actualAlttext);
	    if(actualAlttext.equals(exepectedAltText)) {
	    	System.out.println("pass :the alt text is verified");
	    }
	    else
	    	System.out.println("fail alt text is not verified");
	
	    driver.quit();
	}
	

}
