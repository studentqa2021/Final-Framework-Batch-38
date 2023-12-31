package com.page.object.model;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	//POM = only By method (no need encapsulation)

	public By user = By.xpath("//*[@name='username']");
	public By pass = By.xpath("//*[@name='password']");
	public By loginBtn = By.xpath("//*[@type='submit']");
	public By dropDown =By.xpath("//*[@class='oxd-userdropdown-name']");
	public By logOutBtn= By.xpath("(//*[@role='menuitem']) [4]");
}
