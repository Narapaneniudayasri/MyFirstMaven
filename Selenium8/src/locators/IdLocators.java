package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocators {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/udayasri/Page.html");
		driver.findElement(By.id("username")).sendKeys("this is selenium");
		driver.findElement(By.name("password")).sendKeys("this is java");
		driver.findElement(By.className("cpassword")).sendKeys("this is manual");
		driver.findElement(By.tagName("a")).click();

		
		

	}

}
