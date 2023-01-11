package testng;

import org.testng.annotations.Test;

public class SoftAssert {
	
	@Test
	public void demo()
	{
		String expectedData="abc";
		String actualData="kbc";
		 org.testng.asserts.SoftAssert s = new org.testng.asserts.SoftAssert();
		 s.assertEquals(actualData, expectedData);  //here in soft assert it pass all if it fail or pass
		 System.out.println("pass");
		 s.assertAll(); //here it check whether it really pass or fail
		 
		
	}
	

}
