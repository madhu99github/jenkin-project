package com.jenkins.jenkinsproject;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestClass {
@BeforeTest
	public static void beforeTest() {
	System.out.println("Selected before test of class 1");
}

@Test
public static void Test() {
	System.out.println("Selected  test of class 1");
}
@AfterTest
public static void afterTest() {
	System.out.println("Selected after test of class 1");


}
}
