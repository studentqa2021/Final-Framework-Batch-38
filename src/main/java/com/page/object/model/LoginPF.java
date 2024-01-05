package com.page.object.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPF {
	
	//public By user = By.xpath("//*[@name='username']");
	
	// PF = @FindBy + Java encapsulation
	@FindBy(xpath="//*[@name='username']")
	private WebElement userName;

	public WebElement getUserName() {
		return userName;
	}

	// how to call method in java?
		// static word
		//Inheritance change
	// why method need call?
		//java run code only inside main method>> other method can not run any code
	//so java rules: write code in side other method >> call other method inside main method
	
	

}
