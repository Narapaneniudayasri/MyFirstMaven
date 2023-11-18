package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWebElement {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement element=driver.findElement(By.id("Email"));
		Thread.sleep(1000);
		element.sendKeys("narapaneniudayasri575@gmail.com");
		WebElement element1=driver.findElement(By.id("Password"));
		Thread.sleep(1000);
		element1.sendKeys("Uday@123");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		
		
		
		
		
		

	}

}
