package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Discador {
	
	private By crearCampana;

	private WebDriver driver;
	
	public Discador(WebDriver driver) {
		this.driver = driver;
		crearCampana = By.id("main_moduleContent_current_view_active_module_createCampaign_button");
		
	}
	
	public void crearCampana() {
		driver.findElement(crearCampana).click();
	}
}
