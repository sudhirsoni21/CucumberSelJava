package com.test.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
	WebDriver driver;
	
	@FindBy(id="logout")
	WebElement btn_logout;
	
	public HomePage_PF(WebDriver driver){
		System.out.println("HomePage Object created from PageFactory class");
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean logoutDisplayed(){
		return btn_logout.isDisplayed();
	}

}
