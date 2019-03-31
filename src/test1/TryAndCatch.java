package test1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TryAndCatch {

	@Test
	public void trycatch (){
		String ExptectedValue = "Google"; //Requiremtnt
		String ActualValue = "Gooooogle"; //Result
		
		try {
			Assert.assertEquals(ActualValue, ExptectedValue);
			
		}catch (Throwable anyGivenName) {
		
		System.out.println("exp vs act didn't match"+ anyGivenName);
		}
	
}}
