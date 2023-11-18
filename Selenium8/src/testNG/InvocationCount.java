package testNG;

import org.testng.annotations.Test;

public class InvocationCount 
{
	@Test(invocationCount=5)
	public void login() {
		System.out.println("i'm from login");
	}

}
