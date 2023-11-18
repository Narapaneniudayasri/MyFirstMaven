package testNG;

import org.testng.annotations.Test;

public class DemonstrationForDependsOnMethods
{
	@Test
	public void login() {
		System.out.println("i'm from login");
	}
	@Test(dependsOnMethods="login")
	public void home() {
		System.out.println("i'm from home");
	}
	@Test(dependsOnMethods="logout")
	public void logout() {
		System.out.println("i'm from logout");
	}

}
