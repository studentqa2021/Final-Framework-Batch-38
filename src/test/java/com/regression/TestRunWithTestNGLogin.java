package com.regression;

import org.testng.annotations.Test;

import com.generic.LoginFunction;
import com.report.ExtentReportAutomation;

public class TestRunWithTestNGLogin extends ExtentReportAutomation {

		
	@Test(priority = 0 , description = "Login function",
			groups = {"Smoke","regression","Unit test"})
	public void getLogin() throws Exception {
		LoginFunction obj = new LoginFunction();
		obj.getLogin();
	}
	
	
}
