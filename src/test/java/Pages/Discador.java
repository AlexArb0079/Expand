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
	
	public void editCampana(String name) {
		driver.findElement(By.xpath("//span[text()='" + name + "']")).click();
	}
	
	public void editCampana(int orden) {
		System.out.println(driver.findElement(By.id("main_moduleContent_current_view_active_module_listActiveActive")).findElements(By.xpath("//span[@class='mousePointer']")).get(orden*4).getAttribute("innerText"));
		driver.findElement(By.id("main_moduleContent_current_view_active_module_listActiveActive")).findElements(By.xpath("//span[@class='mousePointer']")).get(orden*4).click();
		
		
		
		
		//System.out.println(driver.findElements(By.xpath("//span[@class='mousePointer']")).get(orden*4).getAttribute("innerText"));
		//driver.findElements(By.xpath("//span[@class='mousePointer']")).get(orden*4).click();
	}
	
}
