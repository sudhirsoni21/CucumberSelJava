package com.test.stepsForGoogleSearch;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver = null;
	
	@Given("Browser is open")
	public void Browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
//	@And("Google url given in browser")
//	public void google_url_given_in_browser() {
//		driver.get("https://google.com");
//	}
//
//	@When("Enter value in search box")
//	public void enter_value_in_search_box() {
//		driver.findElement(By.name("q")).sendKeys("Step by step automation");
//	}
//
//	@And("Click on Search button")
//	public void click_on_search_button() {
//		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
//	}
//
//	@Then("Verify search result page available")
//	public void verify_search_result_page_available() {
//		String searchResult = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/div/cite"))
//				.getText();
//		Assert.assertTrue(searchResult.equalsIgnoreCase("automationstepbystep.com"));
//		driver.quit();
//	}
}
