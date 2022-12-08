package com.ictak.script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {
	WebDriver driver;
	public static Properties prop=null;
	String driverPath="E:\\ST_PROJECT_3\\coding\\Driver\\chromedriver.exe";
	public static void Testbase()
	{
		try
		{
		prop=new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources"+ "/config.properties");
		 prop.load(ip);
		} 
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}
	}
	@BeforeTest
	public void onSetup()
	{
		Testbase();
		String BrowserName=prop.getProperty("browser");
		
		if(BrowserName.equals("chrome"))
			if (BrowserName.equals("chrome")) {
	        	System.setProperty("webdriver.chrome.driver", "E:\\ST_PROJECT_3\\coding\\Driver\\chromedriver.exe");
	            driver = new ChromeDriver();

	        }
	        else if (BrowserName.equals("firefox")) {
	        	
	        	System.setProperty("webdriver.gecko.driver", driverPath);
	            driver = new FirefoxDriver();
	        }
		
	        driver.get(prop.getProperty("url"));
	        driver.manage().window().maximize();   
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //for selenium 4
	    
	    }
	
		
	}
	


