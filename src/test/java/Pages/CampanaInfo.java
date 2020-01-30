package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CampanaInfo {
	private By start;

	private WebDriver driver;

	private WebDriverWait wait;
	
	public CampanaInfo(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		start = By.id("main_moduleContent_current_view_active_module_status_campaign");
		
	}
	
	public void startCampana() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(start));
		driver.findElement(start).click();
	}
}
