package com.webshop.testcase;

import org.testng.annotations.Test;
import org.testng.Assert;


public class HomePageTest extends BaseTest{
	@Test
	public void testHomePageTitle()
	{
		String actual=hp.getHomePageTitle();
		System.out.println(actual);
		Assert.assertEquals("Demo Web Shop",actual);
		//expexted,actual
	}
	@Test
	public void testWebPageImgDisplay()
	{
		boolean flag=hp.WebshopImg();
		System.out.println(flag);
		Assert.assertTrue(flag);

		
	}

}
