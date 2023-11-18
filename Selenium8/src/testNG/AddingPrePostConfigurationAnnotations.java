package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddingPrePostConfigurationAnnotations 
{
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("from before suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("from before Test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("from before Class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("from before Method");
	}
	@Test
	public void test() {
		System.out.println("from method1");
	}
	@Test
	public void test1() {
		System.out.println("from method2");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("from after Suite");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("from after Test");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("from after Class");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("from after Method");
	}
	

}
