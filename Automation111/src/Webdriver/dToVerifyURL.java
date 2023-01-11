package Webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class dToVerifyURL {

	public static void main(String[] args) {
 		String expectedURL="facebook";
 		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
 		String  actualURL=driver.getCurrentUrl();
 		System.out.println("the actual URL :" +actualURL);
 		System.out.println("the expected URL :" +expectedURL);
 		
 		if(actualURL.contains(expectedURL)) {
 			System.out.println("pass : the ur has been verified");
 		}
 		else 
 			System.out.println("Fail: the url has not been verified");
 		}
 		

		
	}


