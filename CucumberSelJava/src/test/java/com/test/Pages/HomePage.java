package com.test.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	

	private By btn_logout_login = By.id("logout");
	
	public HomePage(WebDriver driver){
		System.out.println("HomePage Object created from POM class");
		this.driver = driver;
	}
	
	public boolean logoutDisplayed(){
		return driver.findElement(btn_logout_login).isDisplayed();
	}
}
