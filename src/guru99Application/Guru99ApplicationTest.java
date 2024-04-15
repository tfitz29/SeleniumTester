package guru99Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Guru99ApplicationTest {
	
	ChromeDriver driver;
	
	String url = "https://demo.guru99.com/v4/";
	
	@Test(priority = -100)
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium Testing\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test(priority = 0)
	public void verifyTitleOfThePage() {
		
		String expectedTitle = "Guru99 Bank Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority = 100)
	public void verifyLoginToGuru99Application() {
		
		WebElement userID = driver.findElement(By.name("uid"));
		WebElement userPassword = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.name("btnLogin"));
		
		userID.sendKeys("mngr566497");
		userPassword.sendKeys("gejazyn");
		
		loginButton.click();
	}
	
	@Test(priority = 200)
	public void addCustomer() {
		
		WebElement addCustomerLink = driver.findElement(By.linkText("New Customer"));
		addCustomerLink.click();
		driver.findElement(By.xpath("//input[@value='m']")).click();
		driver.findElement(By.name("name")).sendKeys("Trevor Fitzsimmons");
		driver.findElement(By.name("dob")).sendKeys("11/09/1800");
		driver.findElement(By.name("addr")).sendKeys("Ridge");
		driver.findElement(By.name("city")).sendKeys("Gonq");
		driver.findElement(By.name("state")).sendKeys("Illinois");
		driver.findElement(By.name("pinno")).sendKeys("122011");
		driver.findElement(By.name("telephoneno")).sendKeys("9221338991");
		driver.findElement(By.name("emailid")).sendKeys("xysdfz@abcc.com");
		driver.findElement(By.name("password")).sendKeys("poiiu@123");
		driver.findElement(By.name("sub")).click();
		
	}
	
	@Test(priority = 400)
	public void GetCustomerID() {
		String customerID = driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
		System.out.println("Customer ID - "+ customerID);
	}
}
