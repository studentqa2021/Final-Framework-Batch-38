package com.regression;

import org.testng.annotations.Test;

public class InyterviewCodingTest {
	
	// swap two variable
	static int a =10;
	static int b=20;
	 // want to see console a=20 & b=10
	 
	@Test(description = "swap variable",priority =0,groups = "unit test")
	public void test1() {
		System.out.println("Before swap a value = "+a);
		System.out.println("Before swap b value = "+b);
		//code
		a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		
		System.out.println("After swap a value = "+a);
		System.out.println("After swap b value = "+b);
	}
	
	@Test(description = "Reverse a java String==> negative loop",priority =1,groups = "unit test")
	public void test2() {
		
		//for(end point; start; --) {
		// UNITED STATE OF AMERICA
		String text = "UNITED STATE OF AMERICA";//(why -1 , index one less)
		for(int i=text.length()-1;i>=0;i--) {
			System.out.print(text.charAt(i));
		}
		
		
	}
	@Test(description = "Reverse a java String==> SB/SB",priority =2,groups = "unit test")
	public void test3() {
		
		//for(end point; start; --) {
		// UNITED STATE OF AMERICA
		String text = "UNITED STATE OF AMERICA";//(why -1 , index one less)
		
		StringBuilder sb= new StringBuilder(text);
		System.out.println(sb.reverse());
		
		
	}

}
