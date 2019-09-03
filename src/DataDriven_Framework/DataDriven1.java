package DataDriven_Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataDriven1 {
	WebDriver driver;
	private static final String TimeUnites = null;
	private static final String TimeUnite = null;

	@Test(dataProvider="naukaridata")
	public void LoginToNaukri(String Username, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys(Username);
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(5000);
		//System.out.println(driver.getTitle());
		//driver.quit();
		Assert.assertTrue(driver.getTitle().contains("Facebook"),"user is not able to login-Invalid Credentials");
		System.out.println("Page title verified -User get login successfully");
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}
	@DataProvider(name="naukaridata")
	public Object[][] passData(){
		
		Object[][] data = new Object[3][2];
		data [0][0]= "admin";
		data[0][1]="demo";
		
		data [1][0]= "dhatavkarshraddha@gmail.com";
		data[1][1]="shivganga1993";
		
		data [2][0]= "admin1";
		data[2][1]="demo1";
		
		return data;
	}
}
