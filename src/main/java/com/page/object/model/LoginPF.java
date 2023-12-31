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

	
	
	

}
