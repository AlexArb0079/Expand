package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CrearCampana2 {
	private WebDriver driver;
	private WebDriverWait wait;
	private By agregarContactoManual;
	private By agregarContacto;
	private By nombreDeContacto;
	private By numeroDeTelefono;
	private By extra1;
	private By extra2;
	private By aceptarContacto;
	private By finalizar;
	
	public CrearCampana2(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		agregarContactoManual = By.id("main_moduleContent_current_view_active_module_textinpAgregarContactos_button");
		agregarContacto = By.id("main_moduleContent_current_view_active_module_contacts_container_contactList_toolbar_add_button");
		nombreDeContacto = By.id("main_moduleContent_current_view_active_module_contacts_container_contactList_contactPopup_inpContactName");
		numeroDeTelefono = By.id("main_moduleContent_current_view_active_module_contacts_container_contactList_contactPopup_inpPhone");
		extra1 = By.id("main_moduleContent_current_view_active_module_contacts_container_contactList_contactPopup_dataGrid_repeater_control_value");
		extra2 = By.id("main_moduleContent_current_view_active_module_contacts_container_contactList_contactPopup_dataGrid_repeater_control2_value");
		aceptarContacto = By.id("main_moduleContent_current_view_active_module_contacts_container_contactList_contactPopup_acceptButton_button");
		finalizar = By.id("main_moduleContent_current_view_active_module_cancelCampaign2_button");
		
	}
	
	public void agregarContactosManuales() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(agregarContactoManual));
		driver.findElement(agregarContactoManual).click();
	}
	
	public void agregarContacto(String name, String numero, String adicional1, String adicional2) {
		wait.until(ExpectedConditions.elementToBeClickable(agregarContacto));
		driver.findElement(agregarContacto).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(nombreDeContacto));
		driver.findElement(nombreDeContacto).sendKeys(name);
		driver.findElement(numeroDeTelefono).sendKeys(numero);
		driver.findElement(extra1).sendKeys(adicional1);
		driver.findElement(extra2).sendKeys(adicional2);
		driver.findElement(aceptarContacto).click();
		
	}
	
	public void finalizar() {
		wait.until(ExpectedConditions.elementToBeClickable(agregarContacto));
		driver.findElement(finalizar).click();
	}
	
}
