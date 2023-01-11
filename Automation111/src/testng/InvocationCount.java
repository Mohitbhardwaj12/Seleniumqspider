package testng;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test (invocationCount =5)
	public void demo() {
		System.out.println("Demo test ");
	}
	

}
