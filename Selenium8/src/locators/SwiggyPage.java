package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyPage {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("mobile")).sendKeys("9959392620");
		driver.findElement(By.id("name")).sendKeys("udayasri");
		driver.findElement(By.id("email")).sendKeys("narapaneniudayasri123@gmail.com");
		driver.findElement(By.linkText("CONTINUE")).click();
		
		
		
		
			}

}
