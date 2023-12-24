package com.testng.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngPractice {
	@BeforeGroups
	public void beforeGroups() {
		
		System.out.println("Before group : before all groups");
		
	}
	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("Before Suite : before everything");
		
	}
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Before Class : before all classes");
		
	}
	@BeforeTest
	public void setup() {
		
		System.out.println("Before Test : setup");
		
	}
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("Before method : before each test");
		
	}
	@Test
	public void getLogin() {
		//code
		System.out.println("Login test ");
	}
	@Test
	public void getPyement() {
		//code
		System.out.println("Payment test ");
	}
	@AfterTest
	public void teardown() {
		
		System.out.println("After Test : Close connection");
		
	}
	
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("after Suite : after everything");
		
	}
	@AfterClass
	public void afterClass() {
		
		System.out.println("after Class : after all classes");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("after method : after each test");
		
	}
	@AfterGroups
	public void afterGroups() {
		
		System.out.println("after group : after all groups");
		
	}
}
