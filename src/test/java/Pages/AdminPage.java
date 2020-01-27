package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {
	
	private By discador;

	private WebDriver driver;
	
	public AdminPage(WebDriver driver) {
		this.driver = driver;
		discador = By.id("Web3.LeftBar_categoryDialer_control");
		
	}
	
	public void goToDiscador() {
		driver.findElement(discador).click();
	}
}
