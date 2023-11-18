package testNGPracticeCross;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserExecution 
{
	@Test
	@Parameters("browser")
	public void cbt(String browser) {
		if(browser.equals("chrome")) {
			System.out.println("chrome browser is launched");
		}
		else {
			System.out.println("firefox browser is launched");
		}
	}

}
