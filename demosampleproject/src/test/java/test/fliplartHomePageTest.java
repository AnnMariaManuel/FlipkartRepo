package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.flipkartHomePage;

public class fliplartHomePageTest extends Base 


{
	
	
	@Test
	
	public void verifyFlipkartSearch()
	{
		flipkartHomePage obj=new flipkartHomePage(driver);
		String actualResult = obj.searchItemInFlipKart("mobiles");
		Assert.assertEquals(actualResult, "mobiles");
		
	}
	

}
