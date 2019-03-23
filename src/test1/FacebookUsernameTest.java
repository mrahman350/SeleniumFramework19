package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookUsernameTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\refat\\Documents\\TalentTek\\GitHub\\SeleniumFramework19\\Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("refat@yahoo.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");

	}

}
