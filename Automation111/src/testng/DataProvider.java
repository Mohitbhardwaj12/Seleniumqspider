package testng;

import org.testng.annotations.Test;

//if you have to run same test case multiple time with multiple data 

public class DataProvider {
	
	@Test(dataProvider="data")
	public void test(String state,String capital) {
		System.out.println(state + ":"+capital);
	}
	
	@org.testng.annotations.DataProvider
	public Object[][] data(){
		Object[][]ar=new Object[3][2];
		ar[0][0]="Delhi";
		ar[1][0]="UP";
		ar[2][0]="Karnatka";
		
		ar[0][1]="new Delhi";
		ar[1][1]="Lucknow";
		ar[2][1]="Bengluru";
				
		return ar;
	
	}
	
	

}
