package basicTestScript;

import org.testng.annotations.Test;

import genricUtility.BaseClass;

public class DemoScript2 extends BaseClass{
	
	
	
	@Test(priority =3)
	public void veriefycreatUser() {
		System.out.println("user has been created veriefy again");
	}


}