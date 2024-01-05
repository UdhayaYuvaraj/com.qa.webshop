package com.webshop.driver;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DriverScript {

	
	/*Name:DriverManger
	 * Description:This class manages the driver instance andloads the properties file
	 * DEVELOPEDBY:vinoth
	 * ApproverBy:Santhosh
	 * Data Created/Modified:11/20/2023
	 * 
	 */	
	

	//driver manager is class,responsible to mange the any kind of driver
	public static WebDriver driver;
	static Properties prop;
	
	public DriverScript()
	{
		try {
			File file=new File("./src/test/resources/config/config.properties");
			FileInputStream fis = new FileInputStream(file);
		    prop = new Properties();
		    prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("unable to load the properties file!please check:"+e);
			e.printStackTrace();
		}
	}
	
	@Test
	public void initApplication()
	{
		String browser=prop.getProperty("browser");
		
		if(browser.trim().equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.trim().equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("unsupported browser value please check config file for more information");
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		getAppURL();
		
	}
		public static void getAppURL()
		{
		String url=prop.getProperty("url");
		driver.get(url);
		}
		public static void quitDriver()
		{
			driver.quit();
		}
		
	}
	

