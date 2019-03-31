package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Config;

public class FacebookEmailPassTest extends Config {

        
	@Test 
        public void beforeteststart(){
  
			String email = "//*[@id='u_0_h']]]";
			String pass = "//*[@id='u_0_o']]";
			String Evalue="practicewithJakya@yahoo.com";
			String Pvalue = "PracticePassword";
			
			
			
			driver.findElement(By.xpath(email)).sendKeys(Evalue);
			driver.findElement(By.xpath(pass)).sendKeys(Pvalue);

		}


	}


