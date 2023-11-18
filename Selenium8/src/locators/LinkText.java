package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/udayasri/Page.html");
		//driver.findElement(By.linkText("forget password")).click();
		//driver.findElement(By.partialLinkText("forget password")).click();
		driver.findElement(By.tagName("a")).click();
		
		
	}

}
