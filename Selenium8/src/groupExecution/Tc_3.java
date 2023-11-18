package groupExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_3 {
	@Test(groups={"smoke testing","IT"})
	public void navigatingToAmazon() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Driver1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		driver.quit();
	}


}
