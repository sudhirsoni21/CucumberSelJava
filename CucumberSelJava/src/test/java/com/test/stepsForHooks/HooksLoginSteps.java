package com.test.stepsForHooks;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.pagefactory.HomePage_PF;
import com.test.pagefactory.LoginPage_PF;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksLoginSteps {
	
	WebDriver driver = null;
	LoginPage_PF login;
	HomePage_PF home;
	
	@Before
	public void Browser_is_open() {
		System.out.println("Browser open from Before Method");
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver.get("https://example.testproject.io/web/");
	}
	
	@When("^user enters valid (.*) and (.*)$")
	public void user_enters_valid_userid_and_password(String userid, String password) {
		login = new LoginPage_PF(driver);
		login.enterUserName(userid);
		login.enterPassword(password);
	}

	@And("click on login button")
	public void click_on_login_button() {
		login.clickLogin();
	}

	@Then("user is navigate to home page")
	public void user_is_navigate_to_home_page() {
		home = new HomePage_PF(driver);
		Assert.assertTrue(home.logoutDisplayed());
	}

	@After
	public void tearDown() {
		System.out.println("Browser close from After Method");
		driver.quit();
	}
}
