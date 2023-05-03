package locator;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.DriverSetup;

public class Saucedemo_Project extends DriverSetup{

	@Test
	public void testLoginPage() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		WebElement userNameInput = driver.findElement(By.id("user-name"));
		userNameInput.sendKeys("standard_user");
		Thread.sleep(3000);
		WebElement userPassInput = driver.findElement(By.id("password"));
		userPassInput.sendKeys("secret_sauce");
		Thread.sleep(3000);
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		Thread.sleep(3000);

		WebElement checkBurgerButton = driver.findElement(By.className("bm-burger-button"));

		checkBurgerButton.click();
		Thread.sleep(2000);

		WebElement checkLogoutLinkButton = driver.findElement(By.linkText("Logout"));
		System.out.println(checkLogoutLinkButton.getText());
		assertEquals(checkLogoutLinkButton.getText(), "Logout");
		Thread.sleep(2000);

		WebElement crossButton = driver.findElement(By.className("bm-cross-button"));

		crossButton.click();
		Thread.sleep(2000);

		WebElement clickOnProduct = driver.findElement(By.partialLinkText("Sauce Labs Back"));
		assertEquals(clickOnProduct.getText(), "Sauce Labs Backpack");

		clickOnProduct.click();
		Thread.sleep(2000);

		WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));

		addToCart.click();
		Thread.sleep(2000);

		WebElement removeToCart = driver.findElement(By.name("remove-sauce-labs-backpack"));

		removeToCart.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		// perform a smooth scroll down using JavaScript
		js.executeScript("window.scrollBy(0, 300)", "");
		Thread.sleep(3000); // wait for the page to scroll

		WebElement clickOnNewProduct = driver.findElement(By.id("item_1_title_link"));

		clickOnNewProduct.click();

		Thread.sleep(2000);

		WebElement addNewToCart = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));

		addNewToCart.click();
		Thread.sleep(2000);

		WebElement clcikOnShoppinCart = driver.findElement(By.id("shopping_cart_container"));

		clcikOnShoppinCart.click();

		Thread.sleep(2000);

		WebElement checkoutButton = driver.findElement(By.id("checkout"));

		// perform a smooth scroll down using JavaScript
		js.executeScript("window.scrollBy(0, 300)", "");
		Thread.sleep(1000); // wait for the page to scroll

		checkoutButton.click();

		Thread.sleep(2000);

		WebElement firstName = driver.findElement(By.name("firstName"));

		firstName.sendKeys("Rabbi");

		Thread.sleep(2000);

		WebElement lastName = driver.findElement(By.name("lastName"));

		lastName.sendKeys("Hasan");

		Thread.sleep(2000);

		WebElement postalCode = driver.findElement(By.name("postalCode"));

		postalCode.sendKeys("1200");

		Thread.sleep(2000);

		WebElement submitToContinue = driver.findElement(By.id("continue"));

		// perform a smooth scroll down using JavaScript
		js.executeScript("window.scrollBy(0, 300)", "");
		Thread.sleep(1000); // wait for the page to scroll

		submitToContinue.click();
		Thread.sleep(2000);

		WebElement clickToFinish = driver.findElement(By.id("finish"));
		clickToFinish.click();

		Thread.sleep(2000);

		WebElement backToHome = driver.findElement(By.id("back-to-products"));
		backToHome.click();
		Thread.sleep(2000);

		WebElement clickBurgerButton = driver.findElement(By.className("bm-burger-button"));
		clickBurgerButton.click();
		Thread.sleep(2000);

		WebElement clcikLogoutLinkButton = driver.findElement(By.linkText("Logout"));
		clcikLogoutLinkButton.click();

		Thread.sleep(5000);
		driver.quit();
	}

}
