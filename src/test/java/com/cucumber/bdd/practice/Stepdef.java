package com.cucumber.bdd.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page.object.model.LoginPage;
import com.util.BaseConfig;
import com.util.SeleniumHighLighter;
import com.util.SeleniumWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef {
	WebDriver driver;
	BaseConfig obj = new BaseConfig();
	LoginPage pom = new LoginPage();
	@Given("open a browser")
	public void open_a_browser() {
		 driver = new ChromeDriver();
	}

	@Given("go to application URL")
	public void go_to_application_URL() throws Exception {
		driver.get(obj.getConfig("URL"));// 1
		driver.manage().window().maximize();
		// wait page load GUI
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//wait for HTML load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("put valid user")
	public void put_valid_user() throws Exception {
		SeleniumHighLighter.getColor(driver, driver.findElement(pom.user),"red");
		driver.findElement(pom.user).sendKeys(obj.getConfig("USER"));// 2
		   
	}

	@When("put valid password")
	public void put_valid_password() throws Exception {
		SeleniumHighLighter.getColor(driver, driver.findElement(pom.pass),"green");
		driver.findElement(pom.pass).sendKeys(obj.getConfig("PASSWORD"));// 3= crime
	}

	@When("click login btn")
	public void click_login_btn() {
		SeleniumHighLighter.getColor(driver, driver.findElement(pom.loginBtn),"blue");
		driver.findElement(pom.loginBtn).click();// 4 = PF/POM
	}

	@Then("test will pass if log out btn found")
	public void test_will_pass_if_log_out_btn_found() throws Exception {
		Thread.sleep(5000);
		//logout button should be visible for successful login
		
		driver.findElement(pom.dropDown).click();// 4
		//wait for log out button visible
		WebElement logout = driver.findElement(pom.logOutBtn);// 4
		//Explicit wait
		SeleniumWait.getExplicitWait(driver, logout);
		
	// check logout button is display or not
		boolean logOutFound = logout.isDisplayed();
		System.out.println(logOutFound);
		driver.quit();
	}


}
