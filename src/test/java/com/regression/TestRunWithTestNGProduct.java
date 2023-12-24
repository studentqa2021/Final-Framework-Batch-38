package com.regression;

import org.testng.annotations.Test;

import com.report.ExtentReportAutomation;

public class TestRunWithTestNGProduct {

	
	@Test(enabled = false,priority  = 1,description = "product function", groups = {"functional"})
	public void getProduct() throws Exception {
		//code
	}
	
	
}
