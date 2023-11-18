package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebShopLogin {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("narapaneniudayasri123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).sendKeys("uday@1416");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.id("Loginin-button")).click();

	}

}
