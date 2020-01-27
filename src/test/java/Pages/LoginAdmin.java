package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginAdmin {

	private By userName;
	private By passWord;
	private By LoginButton;
	
	private WebDriver driver;
	
	public LoginAdmin(WebDriver driver) {
		this.driver = driver;
		userName = By.id("login_loginForm_user");
		passWord = By.id("login_loginForm_password");
		LoginButton = By.id("login_loginForm_enterButton_button");
	}
	
	public void login(String name, String pass) {
		driver.findElement(userName).sendKeys(name);
		driver.findElement(passWord).sendKeys(pass);
		driver.findElement(LoginButton).click();
	}
}
