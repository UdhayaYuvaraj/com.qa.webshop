package com.webshop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webshop.driver.DriverScript;

public class HomePage extends DriverScript {

//****************************Page Elements*******************************************//
	@FindBy(linkText="Register")WebElement registerLink;
	@FindBy(linkText="Log in")WebElement loginLink;
	@FindBy(xpath="//img[@alt='Tricentis Demo Web Shop111']")WebElement webShopImg;
	@FindBy(xpath="(//a[contains(text(),'Books')])[1]")WebElement booklink;
	
//***************************Page Initilization**************************************//
	
public HomePage()
{
	PageFactory.initElements(driver,this);
}

//**********************PageMethods/Actions*******************************************//

public void clickRegisterLink()
{
	registerLink.click();
}
public void clickLoginLink()
{
	loginLink.click();
}
public boolean WebshopImg()
{
    return webShopImg.isDisplayed();
}
public String getHomePageTitle()
{
  return driver.getTitle();
}
public void clickbookMenu()
{
    booklink.click();
}
}