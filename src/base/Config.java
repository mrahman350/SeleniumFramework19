package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Config {
	public WebDriver driver;
	
	@BeforeMethod
	 public void FacebookEmailPassTest (){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\refat\\Documents\\TalentTek\\GitHub\\SeleniumFramework19\\Drivers//chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("http://www.facebook.com");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	//@AfterMethod
//	public void aftereachtest (){
	//	driver.close();
	}

//}

