package com.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.facebook.Objects.Facebok_LoginPage;

import Data_supply.Config_data_supply;
import Data_supply.obhjest;
//import Factory.ObjectProviderFactory;
//import jdk.jshell.spi.ExecutionControl.EngineTerminationException;

public class Base_class {
	
	Base_class obj;
	WebDriver driver;
	
	public void browser_type(String browser_name) {
	
		if (browser_name.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", obhjest.getconfig().getchromepath());
			 driver = new ChromeDriver();
		}
		else if(browser_name.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.firefox.marionette", obhjest.getconfig().getchromepath());
			 driver = new FirefoxDriver();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			
			e.printStackTrace();
		}
	
//		Facebbok_login_funtion obj1 = new Facebbok_login_funtion();
//		obj1.fb_login_fun();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(Facebok_LoginPage.Username).sendKeys(obhjest.getconfig().Facebook_username());

		driver.findElement(Facebok_LoginPage.Password).sendKeys(obhjest.getconfig().Facebook_password());
		driver.findElement(Facebok_LoginPage.login).click();
		driver.findElement(Facebok_LoginPage.SignUp).click();
//		obhjest.getcelldata();
		driver.findElement(Facebok_LoginPage.Firstname).sendKeys(obhjest.getcelldata().Facebook_firstname());
		driver.findElement(Facebok_LoginPage.Lastname).sendKeys(obhjest.getcelldata().Facebook_lastname());
		driver.findElement(Facebok_LoginPage.Email).sendKeys(obhjest.getcelldata().Facebook_mop_no());
		driver.findElement(Facebok_LoginPage.Passwordfb).sendKeys(obhjest.getcelldata().Facebook_password());
	}
	
	
	public static void main(String[] args) {
		Base_class obj1 = new Base_class();
		obj1.browser_type(obhjest.getconfig().browser_driver());
//		Facebbok_login_funtion obj2 = new Facebbok_login_funtion();
//		obj2.fb_login_fun();
//		Fb_Register obj3 = new Fb_Register();
//		obj3.register();
//		
		
	}
	}


