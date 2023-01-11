package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		String productPrice="28,999";
				String productName="OnePlus Nord 2T 5G (Jade Fog, 8GB RAM, 128GB Storage)";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=oneplus&ref=nb_sb_noss");
		
		WebElement price = driver.findElement(By.xpath("//span[text()='"+productName+"']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[text()='"+productPrice+"']"));
	
				String actualprice = price.getText();
		
	
				System.out.println(actualprice);
	
	}

}
