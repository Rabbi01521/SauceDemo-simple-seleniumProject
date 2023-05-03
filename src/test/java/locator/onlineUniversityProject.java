package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class onlineUniversityProject {

	@Test
	public void onlineUniversity() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://frontend.iou.ac");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement modalBtn = driver.findElement(By.id("modalBtn"));

		modalBtn.click();

		WebElement userEmailInput = driver.findElement(By.id("email"));
		userEmailInput.sendKeys("test12345@gmail.com");
		Thread.sleep(3000);
		WebElement userPassInput = driver.findElement(By.id("id_password"));
		userPassInput.sendKeys("123456");
		Thread.sleep(3000);
		WebElement loginButton = driver.findElement(
				By.xpath("//body/div[@id='__next']/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]"));

		loginButton.click();
		Thread.sleep(3000);

		WebElement userButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/button"));
		userButton.click();

		WebElement myCourse = driver.findElement(By.xpath("//*[@id=\"dropdownNavbar\"]/ul/a[2]"));

		myCourse.click();
		Thread.sleep(3000);

		WebElement courseUploadBtn = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div/div[2]/div[1]/div/div[1]/div/div[2]"));

		courseUploadBtn.click();
		Thread.sleep(3000);

		WebElement courseTitle = driver.findElement(By.name("title"));
		courseTitle.sendKeys("SQA");
		Thread.sleep(3000);

		WebElement dropdownElement = driver
				.findElement(By.xpath("//div[@class='mb-3 w-full']//div[@class=' css-b62m3t-container']"));

		dropdownElement.click();

		Thread.sleep(3000);

		driver.findElement(By.id("react-select-3-option-3")).click();

		driver.findElement(By.id("custom-checkbox")).click();
		driver.findElement(By.cssSelector(".ql-editor > p")).click();
		Thread.sleep(3000);

		{
			WebElement element = driver.findElement(By.cssSelector(".ql-editor"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(
					"if(arguments[0].contentEditable === 'true') {arguments[0].innerText = 'hello this is test'}",
					element);
		}

		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div/div/div[2]/form/div[6]/div/div/div/div[1]/div[2]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.id("react-select-2-option-0")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div/div/div[2]/form/div[7]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div/div/div[2]/form/div[3]/textarea")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div/div/div[2]/form/div[3]/textarea"))
				.sendKeys("https://www.youtube.com/watch?v=J1OPEe6wYX4");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div/div/div[2]/form/div[5]/div/button"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.id("dropzone-file")).sendKeys(
				"C:\\Users\\HP\\Documents\\workspace-spring-tool-suite-4-4.18.0.RELEASE\\TestingWeb01\\road.jpg");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div/div/div[2]/form/div[5]/div/button"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//h1[normalize-space()='test12345@gmail.com'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[normalize-space()='My Course'])[1]")).click();
		Thread.sleep(10000);

		driver.quit();
	}

}
