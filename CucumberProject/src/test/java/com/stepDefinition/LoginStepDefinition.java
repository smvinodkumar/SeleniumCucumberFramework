package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
static WebDriver driver;

	@Given("user is on facebook login page")
	public void user_is_on_facebook_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\eclipse-workspace\\basicProjectjava\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("vinod@gmail.com");
		WebElement passw = driver.findElement(By.id("pass"));
		passw.sendKeys("1234444");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	  
	}
	@When("user clic on the Login button")
	public void user_clic_on_the_login_button() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	  
	}
	@Then("user is on Facebook Home Page")
	public void user_is_on_facebook_home_page() {
	    System.out.println("user is on ligin home page");
	}
}
