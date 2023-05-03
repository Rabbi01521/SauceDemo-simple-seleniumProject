package locator;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.DriverSetup;

public class MyFirstWebTest extends DriverSetup{
	
	@Test
	public void testWebPageTitle() throws InterruptedException {
		driver.get("https://automationpanda.com/");
		System.out.println(driver.getTitle());
		assertEquals(driver.getTitle(), "Automation Panda | A blog for software development and testing");
		Thread.sleep(3000);
	}
	

	@Test
	public void testDescriptionByClass() throws InterruptedException {
		driver.get("https://automationpanda.com/");
		WebElement entryTitle = driver.findElement(By.className("search-field"));
		entryTitle.click();
		entryTitle.sendKeys("api");
		Thread.sleep(2000);
		entryTitle.submit();
		System.out.println(entryTitle.getText());
		Thread.sleep(10000);
	}
	
	public void testSearchFieldById() throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		WebElement searchInput = driver.findElement(By.id(""));
		searchInput.sendKeys("Hello World");
		WebElement searchButton = driver.findElement(By.className(""));
		searchButton.click();
		Thread.sleep(5000);
	}
	
//	public void testNameByLinkText() {
//		
//		driver.get("");
//		WebElement name = driver.findElement(By.linkText(""));
//		
//		assertEquals(name.getText(), "");
//	}
	
}















 