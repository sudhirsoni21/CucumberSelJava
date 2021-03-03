package com.test.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	WebDriver driver;
	
	@FindBy(id="name")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="Login")
	WebElement btn_login;
	
	
	public LoginPage_PF(WebDriver driver){
		System.out.println("LoginPage Object created from PageFacory class");
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUserName(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickLogin() {
		btn_login.click();
	}
	
	public void loginValidUser(String username, String password) {
		enterUserName(username);
		enterPassword(password);
		clickLogin();
	}
	
}