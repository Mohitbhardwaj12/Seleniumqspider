package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollBoth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/audio-video/headphones/pr?sid=0pm%2Cfcn&otracker=categorytree&p%5B%5D=facets.connectivity%255B%255D%3DBluetooth&fm=neo%2Fmerchandising&iid=M_6a79f953-b03c-4c80-b271-a9950694592e_1_372UD5BXDFYS_MC.R08R6GB1Q1BI&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Electronics~Audio~Bluetooth%2BHeadphones_R08R6GB1Q1BI&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L2_view-all&cid=R08R6GB1Q1BI");
		driver.manage().window().setSize(new Dimension(300,600));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,500)");
		
		js.executeScript("history.go(0)");    //to refresh
		
		
	}

}
