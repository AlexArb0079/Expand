package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CrearCampana1 {
	private WebDriver driver;
	
	private By nombre;
	private By fechaInicio;
	private By horaInicio;
	private By minutoInicial;
	private By horaFinal;
	private By minutoFinal;
	private By lineas;
	private By tipo;
	private By canal;
	private By template;
	private By ok;
	private By cancel;
	private By fechaFinal;
	private By sinFechaFinal;
	
	public CrearCampana1(WebDriver driver) {
		this.driver = driver;
		nombre = By.id("main_moduleContent_current_view_active_module_new_campaign_form_inpName");
		fechaInicio = By.id("main_moduleContent_current_view_active_module_new_campaign_form_inpFechaInicio_input_date");
		fechaFinal = By.id("main_moduleContent_current_view_active_module_new_campaign_form_inpFechaFin_input_date");
		sinFechaFinal = By.id("checkDateEnd");
		//días id="checkMonday" (etc)
		//fechas no llamar //te lo debo
		horaInicio = By.id("main_moduleContent_current_view_active_module_new_campaign_form_cmdhourStart");// (select)
		minutoInicial = By.id("main_moduleContent_current_view_active_module_new_campaign_form_cmdminStart");
		horaFinal = By.id("main_moduleContent_current_view_active_module_new_campaign_form_cmdhourEnd");
		minutoFinal = By.id("main_moduleContent_current_view_active_module_new_campaign_form_cmdminEnd");
		lineas = By.id("main_moduleContent_current_view_active_module_new_campaign_form_linesS");
		tipo = By.id("main_moduleContent_current_view_active_module_new_campaign_form_selectTypeCampaign");
		canal = By.id("main_moduleContent_current_view_active_module_new_campaign_form_whatsappContainer_selectChannel");
		template = By.id("main_moduleContent_current_view_active_module_new_campaign_form_whatsappContainer_selectTemplate");
		ok = By.id("main_moduleContent_current_view_active_module_new_campaign_form_okCampaign_button");
		cancel = By.id("main_moduleContent_current_view_active_module_new_campaign_form_cancelCampaign1_button");
		
		
		
		
		
	}
	
	public void crearCampana() {
		driver.findElement(nombre).sendKeys("Campana auto 1");
		
		((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", 
				driver.findElement(fechaInicio), "value", "2020/02/20");
		
		driver.findElement(sinFechaFinal).click();
		new Select(driver.findElement(tipo)).selectByValue("whatsapp");
		new Select(driver.findElement(canal)).selectByValue("1");
		new Select(driver.findElement(template)).selectByValue("4");
		
		
		driver.findElement(ok).click();
	}
}
