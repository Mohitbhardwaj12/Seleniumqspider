package basicTestScript;

import org.testng.annotations.Test;

import genricUtility.BaseClass;

public class DemoScript extends BaseClass {
	
	
	@Test(priority=1)
	public void veriefylogin() {
		System.out.println("login page has been verified");
	}
	@Test(priority =2)
	public void veriefycreatUser() {
		System.out.println("user has been created veriefy");
	}

}

/*if we run only in one  class then pattern is 
 * Data base connection has been established
Browser has been launched 
navigate the url
logged into application
login page has been verified
logged out application
logged into application
user has been created veriefy
logged out application
logged into application
user has been created veriefy again
logged out application
browser has been closed
data connection has been closed
 */


/*if run in more than one screen then steps are 

Data base connection has been established
Browser has been launched 
navigate the url
logged into application
login page has been verified
logged out application
logged into application
user has been created veriefy
logged out application
browser has been closed
Browser has been launched 
navigate the url
logged into application
user has been created veriefy again
logged out application
browser has been closed
data connection has been closed */