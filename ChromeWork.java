package seleniumScripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWork {
	
	ChromeDriver driver;
	String url = "http://demo.guru99.com/v4";
	
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium Testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void getTitle() {
		String titleOfThePage = driver.getTitle();
		System.out.println("Title of the Page - "+ titleOfThePage);
	}
	
	public void closeBrowser() {
		//driver.close();
		driver.quit();
	}
	
	public static void main(String[] args) {
		ChromeWork wc = new ChromeWork();
		wc.invokeBrowser();
		wc.getTitle();
		wc.closeBrowser();
	}
}
