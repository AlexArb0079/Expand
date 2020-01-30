package tests;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.AdminPage;
import Pages.CrearCampana1;
import Pages.CrearCampana2;
import Pages.Discador;
import Pages.LoginAdmin;

import java.time.Duration;


public class SearchTest {
	@Test
	public void search() {
		//change per os
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.manage().window().maximize();
		driver.navigate().to("http://canalesdigitales.expand/");
		/*
		driver.findElement(By.id("login_loginForm_user")).sendKeys("alexis.colman");
		driver.findElement(By.id("login_loginForm_password")).sendKeys("alexis.colman");
		driver.findElement(By.id("login_loginForm_enterButton_button")).click();
		*/
		LoginAdmin login = new LoginAdmin(driver);
		
		login.login("alexis.colman", "alexis.colman");
		
				
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("main_moduleContent_current_view_active_module_ActivityMonitor_title")));
		
		AdminPage adminPage = new AdminPage(driver);
		
		adminPage.goToDiscador();
		
		Discador discador = new Discador(driver);
		
		discador.crearCampana();
		
		CrearCampana1 crearCampana1 = new CrearCampana1(driver);
		
		crearCampana1.crearCampana();
		
		CrearCampana2 crearCampana2 = new CrearCampana2(driver, wait);
		
		crearCampana2.agregarContactosManuales();
		crearCampana2.agregarContacto("alexis", "098356565", "algo1", "algo2");
		crearCampana2.agregarContacto("fernando", "09771217", "otroAlgo1", "otroAlgo2");
		crearCampana2.finalizar();
		
		
		//doooobag
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//String targetText = driver.findElement(By.className("heading-counter")).getText();
		//Assert.assertEquals(targetText, "0 results have been found.");
        
		driver.close();
		driver.quit();
		
		
		
		
	}
}
