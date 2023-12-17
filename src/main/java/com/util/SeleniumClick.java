package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumClick {
	
	public void ctionClick(WebDriver driver,WebElement element) {
		
		Actions act = new Actions(driver);
		act.click(element).perform();
		
	}

	public void javScriptClick(WebDriver driver,WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		
	}
	
	//interface instatiation = Y/N= No
	//how to handle
	//1) create object by help of class ==> knwn as up casting
	//2) create object by help of different thing , like driver helping = type casting
}
