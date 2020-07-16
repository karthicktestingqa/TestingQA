package seleniumBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.ConstantData;

public class ProjectSpecifiedMethods {
	public static ChromeDriver driver;
	@BeforeMethod
	public void runDrive() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(ConstantData.URL);
	}
	
	@AfterMethod
	
	public void closeDriver() {
		driver.close();
	}

}
