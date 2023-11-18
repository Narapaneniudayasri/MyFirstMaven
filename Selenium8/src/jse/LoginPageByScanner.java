package jse;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


	public class LoginPageByScanner {

		public static void main(String[] args) throws Throwable 
		{
	        Scanner scan=new Scanner(System.in);
	        System.out.println("Enter the email :");
	        String s=scan.nextLine();
	        System.out.println("Enter the password:");
	        String s1=scan.nextLine();
			System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			
			
			driver.get("https://demowebshop.tricentis.com/login");
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			WebElement email=driver.findElement(By.id("Email"));
			WebElement pass=driver.findElement(By.id("Password"));
			WebElement button=driver.findElement(By.id("RememberMe"));
		    WebElement login=driver.findElement(By.xpath("//input[@value='Log in']"));
		    
		    jse.executeScript("arguments[0].value='"+s+"'",email);
		    Thread.sleep(2000);
		    
		    jse.executeScript("arguments[0].value='"+s1+"'",pass);
		    Thread.sleep(2000);
		    
		    jse.executeScript("arguments[0].click()",button);
		    Thread.sleep(2000);
			
		    jse.executeScript("arguments[0].click()",login);
		}

	}


