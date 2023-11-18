package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterWebElement {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		Thread.sleep(1000);
		WebElement element=driver.findElement(By.id("FirstName"));
		element.sendKeys("Udayasri");
		Thread.sleep(1000);
		WebElement element1=driver.findElement(By.id("LastName"));
		element1.sendKeys("Narapaneni");
		Thread.sleep(1000);
		WebElement element2=driver.findElement(By.id("Email"));
		element2.sendKeys("narapaneniudayasri575@gmail.com");
		Thread.sleep(1000);
		WebElement element3=driver.findElement(By.id("Password"));
		element3.sendKeys("Uday@123");
		Thread.sleep(1000);
		WebElement element4=driver.findElement(By.id("ConfirmPassword"));
		element4.sendKeys("Uday@123");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		
	

	}

}
