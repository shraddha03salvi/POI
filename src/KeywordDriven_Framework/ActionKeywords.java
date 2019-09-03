package KeywordDriven_Framework;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActionKeywords {
	static WebDriver driver;

	@Test
	public static void OpenBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/nlogin/login");
	}

//	@Test
//	public static void navigate() throws Exception {
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		}

	@Test
	public static void Sendkeys_Textfield() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.id("usernameField")).sendKeys("dhatavkarshraddha@gmail.com");
		Thread.sleep(3000);
	}

	@Test
	public static void Sendkeys_Textfield1() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.id("passwordField")).sendKeys("shraddhacom");
		Thread.sleep(2000);
	}

	@Test
	public static void Click() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		Thread.sleep(4000);
	}

	@Test
	public static void closeBrowser() {
		driver.close();
	}

}
