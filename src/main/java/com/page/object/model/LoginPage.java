package com.page.object.model;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	// store all login related xpath

	// which datatype to use==> Web element
	// PF or POM concept
	// PF ==> @FindBy
	// POM ==> By

	public By user = By.xpath("//*[@name='username']");
	public By pass = By.xpath("//*[@name='password']");
	public By loginBtn = By.xpath("//*[@type='submit']");
	public By dropDown =By.xpath("//*[@class='oxd-userdropdown-name']");
	public By logOutBtn= By.xpath("(//*[@role='menuitem']) [4]");
}
