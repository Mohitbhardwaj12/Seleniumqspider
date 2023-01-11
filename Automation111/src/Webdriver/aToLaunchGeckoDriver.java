package Webdriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class aToLaunchGeckoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.geckgo.driver","./drivers/geckodriver.exe");
		new FirefoxDriver();
		
	}

}
