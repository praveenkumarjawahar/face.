package com.facebook.Objects;

import org.openqa.selenium.By;

public class Facebok_LoginPage {
	
	
	public static By Username = By.xpath("//input[@name ='email']");
	public static By Password = By.xpath("//input[@name ='pass']");
	public static By login = By.xpath("//input[@type = 'submit']");
	public static By Firstname = By.xpath("//input[@name = 'firstname']");
	public static By Lastname = By.xpath("//input[@name = 'lastname']");
	public static By Email = By.xpath("//input[@name = 'reg_email__']");
	public static By Passwordfb = By.xpath("//input[@name = 'reg_passwd__']");
	public static By SignUp = By.xpath("//a[@id='reg-link']");
	
	
}
