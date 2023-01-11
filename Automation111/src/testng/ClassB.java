package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassB {
	

	@Test (groups="smoke")
	public void login() {
		System.out.println("login succecfull");
	}
	@Test (groups="regression")
	public void search() {
		System.out.println("product found");
	}
	@Test (groups="regression")
	public void select() {
		Assert.fail();
		System.out.println("product has benn selected");
	}
	@Test(groups="regression")
	public void addToCart() {
		System.out.println("product has added");
	}
	@Test(groups="regression")
	public void payment() {
		System.out.println("payment succesful");
	}
	@Test(groups="smoke" )
	public void logout() {
		System.out.println("logout succesful");
	}
	
	
	
	

}
