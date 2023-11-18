package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	   	driver.manage().window().maximize();
		driver.get("file:///E:/udayasri/Page.html");
		driver.findElement(By.id("username")).sendKeys("im selenium");
		

	}

}
