package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.flipkartHomePage;

public class fliplartHomePageTest extends Base 


{
	
	
	@Test(groups="Sanity Test",priority = 1)
	
	public void verifyFlipkartSearch()
	{
		flipkartHomePage obj=new flipkartHomePage(driver);
		String actualResult = obj.searchItemInFlipKart("mobiles");
		Assert.assertEquals(actualResult, "mobiles","results not matching ");
		
	}
	
	
	@Test(groups="Sanity Test",priority = 2)
	public void verifysearchIcon()
	{
		flipkartHomePage obj=new flipkartHomePage(driver);
		String result=obj.searchItemInFlipKart("laptops");
		Assert.assertEquals(result, "laptops");
	}
	

}
