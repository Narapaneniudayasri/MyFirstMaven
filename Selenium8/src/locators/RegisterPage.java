package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Narapaneni");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Udayasri");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("narapaneniudayasri123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).sendKeys("uday@1416");
		Thread.sleep(2000);
		driver.findElement(By.name("ConfirmPassword")).sendKeys("uday@1416");
		
		driver.findElement(By.id("register-button")).click();
		
		

	}

}
