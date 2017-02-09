package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class TestAboutUs extends TestBase {
	@BeforeClass
	public void classSetup(){
		headerSection.aboutUsLink.click();
	}
	
	@Test
	public void testAboutUsLinkPage(){
		Assert.assertEquals(driver.getCurrentUrl(), "http://elitecareer.net/aboutus");
		headerSection.jobSearchLink.click();
	}
	
	

}
