package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PracticewithJakya {

	 @Test
	 public void practicewithJkya (){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\refat\\Documents\\TalentTek\\GitHub\\SeleniumFramework19\\Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		String Email="//*[@id='email']";
		String pass="//*[@id='pass']";
		String EmailValue = "practicewithJakya@yahoo.com";
		String PassValue = "PracticePassword";
		
		driver.findElement(By.xpath(Email)).sendKeys(EmailValue);
		driver.findElement(By.xpath(pass)).sendKeys(PassValue);

	}

}
