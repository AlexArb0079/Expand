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

import java.time.Duration;


public class SearchTest {
	@Test
	public void search() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.manage().window().maximize();
		driver.navigate().to("http://canalesdigitales.expand/frontEnd/login");
		driver.findElement(By.id("login_loginForm_user")).sendKeys("alexis.colman");
		driver.findElement(By.id("login_loginForm_password")).sendKeys("alexis.colman");
		driver.findElement(By.id("login_loginForm_enterButton_button")).click();
		
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("center_column")));
		

		//String targetText = driver.findElement(By.className("heading-counter")).getText();
		//Assert.assertEquals(targetText, "0 results have been found.");
        
		driver.close();
		driver.quit();
		
		
		
		
	}
}
