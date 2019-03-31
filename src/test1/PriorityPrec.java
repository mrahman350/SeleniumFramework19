package test1;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityPrec {
	
	@Test (priority=2)
	public void ChangePass (){
		System.out.println("Changing PASS");
	}
	
	@Test (priority=3)
	public void logIn (){
		System.out.println("LOG In");
	}
	
	@Test (priority=4)
	public void SkipTest (){
		System.out.println("Skip test");
		throw new SkipException ("skipping the test becasue it no longer use");
	}

	@Test (priority=1) //(Cmnt: you can either put 1 or leave it blank. system will take the blank one as first one)
	public void logOut (){
		System.out.println("Log Out");
	}
	
	@Test (enabled=false)
	public void dontshowThisTestOnReport (){
		System.out.println("it doesn't show on the report");
	}
	
}
