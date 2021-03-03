package com.test.stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.Pages.HomePage;
import com.test.Pages.LoginPage;
import com.test.pagefactory.HomePage_PF;
import com.test.pagefactory.LoginPage_PF;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	public WebDriver driver;

	// When using PageFactory class
	LoginPage_PF login;
	HomePage_PF home;
	
	/*// When using POM
	LoginPage login;
	HomePage home;*/
	
	public WebDriver LoginPage() {
		return this.driver;
	}

	@Given("Browser is open")
	public void Browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@And("User is on login page")
	public void User_is_on_login_page() {
		driver.get("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		login = new LoginPage_PF(driver);
		login.enterUserName(username);
		login.enterPassword(password);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		login.clickLogin();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		home = new HomePage_PF(driver);
		Assert.assertTrue(home.logoutDisplayed());
		driver.quit();
	}
	
	@And("Google url given in browser")
	public void google_url_given_in_browser() {
		driver.get("https://google.com");
	}

	@When("Enter value in search box")
	public void enter_value_in_search_box() {
		driver.findElement(By.name("q")).sendKeys("Step by step automation");
	}

	@And("Click on Search button")
	public void click_on_search_button() {
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
	}

	@Then("Verify search result page available")
	public void verify_search_result_page_available() {
		List<WebElement> searchResults = driver.findElements(By.xpath("//div[@class='TbwUpd NJjxre']"));
		String searchResult = searchResults.get(0).getText();
		Assert.assertTrue(searchResult.equalsIgnoreCase("automationstepbystep.com"));
		driver.quit();
	}

}
