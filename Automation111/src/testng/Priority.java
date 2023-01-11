package testng;

import org.testng.annotations.Test;

public class Priority {
	
	
		
		@Test (priority=2)
		public void ademo() {
			System.out.println("Demo test a");
		}
		
			@Test (priority=1)
			public void bdemo() {
				System.out.println("Demo test b");
			}
		
			@Test
			public void Ademo() {
				System.out.println("Demo test A");
			}
			@Test(priority =3)
			public void Bdemo() {
				System.out.println("Demo test B");
			}

			@Test(priority =-3)
			public void Cdemo() {
				System.out.println("Demo test C");
			}

}
