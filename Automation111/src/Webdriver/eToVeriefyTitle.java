package Webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class eToVeriefyTitle {

	public static void main(String[] args) {
		String expectedTitle="Google";
 		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
 		String  actualTitle=driver.getTitle();
 		System.out.println("the actual URL :" +actualTitle);
 		System.out.println("the expected URL :" +expectedTitle);
 		
 		if(actualTitle.contains(expectedTitle)) {
 			System.out.println("pass : the Title has been verified");
 		}
 		else 
 			System.out.println("Fail: the Title has not been verified");
	}

}
