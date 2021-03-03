package com.test.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage {
	WebDriver driver;

	private By txt_username_login = By.id("name");
	private By txt_password_login = By.id("password");
	private By btn_login_login = By.id("Login");
	
	public LoginPage(WebDriver driver){
		System.out.println("LoginPage Object created from POM class");
		this.driver = driver;
	}

	public void enterUserName(String username) {
		driver.findElement(txt_username_login).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password_login).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(btn_login_login).click();
	}
	
	public void loginValidUser(String username, String password) {
		enterUserName(username);
		enterPassword(password);
		clickLogin();
	}
	
	
}

