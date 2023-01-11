package genricUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import POMRepo.HomePage;
import POMRepo.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public FileUtility fUtills=new FileUtility();
	public ExcelUtility eUtills = new ExcelUtility();
	
	@BeforeSuite
	public void bsConfig() {
		System.out.println("Data base connection has been established");
		
	}
	@BeforeClass
	public  void bcConfig() throws IOException {
		//FileUtility fUtills = new FileUtility();
		String url = fUtills.fetchDataFromPropertyFiles("url");
		
		   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
       	 driver =new ChromeDriver();
   		driver.manage().window().maximize();
   		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   		driver.get(url);
   		
		System.out.println("Browser has been launched ");
		System.out.println("navigate the url");
		
	}
	@BeforeMethod
	public void bmConfig() throws IOException {
		String username = fUtills.fetchDataFromPropertyFiles("username");
		String password = fUtills.fetchDataFromPropertyFiles("password");
	
		LoginPage login=new LoginPage(driver);
   		login.LoginAction(username, password);
   		
		System.out.println("logged into application");
	}
	@AfterMethod
	public void amConfig() {
		HomePage home = new HomePage(driver);
		home.logoutAction();
		System.out.println("logged out application");
	}
	@AfterClass
	public void afConfig() {
		driver.quit();
		System.out.println("browser has been closed");
	}
	@AfterSuite
	public void asConfig() {
		
		System.out.println("data connection has been closed");
	}
	

}
