package test1;

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
		
		
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("practicewithJakya@yahoo.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("PracticePassword");

	}

}
