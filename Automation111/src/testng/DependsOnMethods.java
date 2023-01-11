package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {


		@Test(priority =1)
		public void login() {
			System.out.println("login succecfull");
		}
		@Test (dependsOnMethods = "login")
		public void search() {
			System.out.println("product found");
		}
		@Test (dependsOnMethods = "search")
		public void select() {
			Assert.fail();
			System.out.println("product has benn selected");
		}
		@Test(dependsOnMethods = "select")
		public void addToCart() {
			System.out.println("product has added");
		}
		@Test(dependsOnMethods = "addToCart")
		public void payment() {
			System.out.println("payment succesful");
		}
		@Test(dependsOnMethods = "payment")
		public void logout() {
			System.out.println("logout succesful");
		}
		
		
		
		
		
		
		
		
	}


