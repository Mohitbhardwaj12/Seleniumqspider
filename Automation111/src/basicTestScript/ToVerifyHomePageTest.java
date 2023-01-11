package basicTestScript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import POMRepo.HomePage;
import POMRepo.LoginPage;
import genricUtility.BaseClass;
import genricUtility.ExcelUtility;
import genricUtility.FileUtility;
import genricUtility.WebDriverUtility;

public class ToVerifyHomePageTest extends BaseClass {

	@Test
	public void toVerifyHomePageTest() throws IOException
	{
		
			
		String expectedTitle = eUtills.fetchStringDataFromExcelSheet("sheet3", 1, 0);
		
		
	       
	   		
	   		WebDriverUtility wutils = new WebDriverUtility();
	   		wutils.toWaitForTitle(driver, "Enter");
	   		
	   		HomePage home = new HomePage(driver);
	   		String actualtitle = home.verifyHomePageTitle();
	   		
	   		Assert.assertEquals(actualtitle, expectedTitle);   //this is in place of if
	   		System.out.println("pass : the title is verified");
	   		
	   		
	   		
	   		
	   		
	       
	     
	}

}
