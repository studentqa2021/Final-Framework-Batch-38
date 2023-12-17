package com.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.page.object.model.LoginPage;
import com.util.BaseConfig;
import com.util.SeleniumHighLighter;
import com.util.SeleniumWait;

public class LoginFunction {
	
	public void getLogin() throws Exception {
	
		WebDriver driver = new ChromeDriver();
		//go to application link
		BaseConfig obj = new BaseConfig();
		driver.get(obj.getConfig("URL"));// 1
		//maximized browser
		driver.manage().window().maximize();
		// wait page load GUI
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//wait for HTML load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		LoginPage pom = new LoginPage();
		
		SeleniumHighLighter.getColor(driver, driver.findElement(pom.user),"red");
		// user name 
		driver.findElement(pom.user).sendKeys(obj.getConfig("USER"));// 2
		//valid password
		SeleniumHighLighter.getColor(driver, driver.findElement(pom.pass),"green");
		driver.findElement(pom.pass).sendKeys(obj.getConfig("PASSWORD"));// 3= crime
//handle 1+2+3 = config.properties =URL, use & pass
		//click login
		SeleniumHighLighter.getColor(driver, driver.findElement(pom.loginBtn),"blue");
		driver.findElement(pom.loginBtn).click();// 4 = PF/POM

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
		
		
		
		// close the browser
		 driver.quit();
		
	}

}
