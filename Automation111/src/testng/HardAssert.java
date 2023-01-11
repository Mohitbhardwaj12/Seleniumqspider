package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	private void demo() {
		String expectedData="abc";
		String actualData="ab";
		
		Assert.assertEquals(actualData, expectedData);
		System.out.println("pass");

	}

}
