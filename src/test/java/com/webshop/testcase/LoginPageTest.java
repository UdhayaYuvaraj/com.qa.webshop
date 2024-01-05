package com.webshop.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {
	
	@Test
	public void testLoginPageTest()
	{
		hp.clickLoginLink();
		lp.enterEmail("selauto1@test.com");
		lp.enterPassword("Pass@123");
        lp.LoginButton();	
		
	}
	@Test
public void testForgotPasswordlink()
{
    hp.clickLoginLink();
	boolean flag=lp.forgotpasswordlink();
	Assert.assertTrue(flag);
}
}
