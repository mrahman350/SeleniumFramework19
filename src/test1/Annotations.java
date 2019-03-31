package test1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	//Comnt: @test would run first, then before suite, before test, after test, aftersuite
	
	@Test
	public void mytest (){
		System.out.println("run at test");
	}
	
	@BeforeSuite
	public void b4suite (){
		System.out.println("test run before suite");
	}
	
	
	@AfterSuite 
		public void afsuite (){
		
		System.out.println("run after the suite");
			
		}
	@BeforeTest
	public void b4test (){
		System.out.println("test ran before test");
	}

	@AfterTest 
	public void aftest (){
	
	System.out.println("run after the test");
		
	}



}
	


