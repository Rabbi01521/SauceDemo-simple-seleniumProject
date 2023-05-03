package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.DriverSetup;

public class locator_learning_Advanced extends DriverSetup{
	
	@Test
	public void LocateRadioButtonByCssSelector() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radioButton = driver.findElement(By.cssSelector("input[value='radio2']"));
		radioButton.click();
		Thread.sleep(3000);
	}
	
	@Test
	public void LocateRadioButton3ByXpath() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='radio3']"));
		radioButton.click();
		Thread.sleep(3000);
	}
	
	@Test
	public void LocateHeadingByCssSelector() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement heading = driver.findElement(By.cssSelector("h1"));
		System.out.println(heading.getText());
		Thread.sleep(3000);
	}
	
	@Test
	public void LocateHeadingByXpathTagName() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement heading = driver.findElement(By.xpath("//h1"));
		System.out.println(heading.getText());
		Thread.sleep(3000);
	}
	

}
