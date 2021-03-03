package com.test.stepsForBackground;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundSteps {
	
	WebDriver driver = null;
	
	@Given("user is on Login page")
	public void user_is_on_login_page() {
		System.out.println("Browser open from Before Method");
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@When("user enters userid and password")
	public void user_enters_userid_and_password() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");		
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("user navigated to Home Page")
	public void user_navigated_to_home_page() {
		Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
	}
	
	@When("User clicks on welcome link")
	public void user_clicks_on_welcome_link() {
		driver.findElement(By.id("welcome")).click();
	}

	@Then("Logout link is present")
	public void logout_link_is_present() {
		explicitWait(driver.findElement(By.xpath("//a[contains(text(), 'Logout')]")));
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(), 'Logout')]")).isDisplayed());
	}

	@When("User clicks on dashboard link")
	public void user_clicks_on_dashboard_link() {
		driver.findElement(By.xpath("//a[@id='menu_dashboard_index']")).click();
	}

	@Then("Quick launch toolbar is displayed")
	public void quick_launch_toolbar_is_displayed() {
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'Quick Launch')]")).isDisplayed());
	}
	
	public void explicitWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
