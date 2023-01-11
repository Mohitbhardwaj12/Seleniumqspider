package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genricUtility.BaseClass;

public class LoginPage extends BaseClass{
	
	//constructor find by load
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//identify elemnt
	@FindBy(id ="username")
	private WebElement usernameTextField;
	
	@FindBy(name="pwd")
	private WebElement passwordTextField;

	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginButton;
     //private member access
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	// Buisness Logic
	public void LoginAction(String username ,String password ) {
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
		
		
	}
	
	
	

}
