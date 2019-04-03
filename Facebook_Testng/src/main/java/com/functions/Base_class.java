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
	driver.get("https://facebook.com");
	driver.findElement(Facebok_LoginPage.Username).sendKeys(obhjest.getconfig().Facebook_username());
	driver.findElement(Facebok_LoginPage.Password).sendKeys(obhjest.getconfig().Facebook_password());
	driver.findElement(Facebok_LoginPage.login).click();
	}
	public static void main(String[] args) {
		Base_class obj1 = new Base_class();
		obj1.browser_type("chrome");
		
	}
	}


