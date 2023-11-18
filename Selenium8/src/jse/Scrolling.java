package jse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scrolling
{

	

		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "./Driver1/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://demowebshop.tricentis.com/");
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("scrollTo(0,500);");
			//js.executeScript("alert('welcome page');");
			//js.executeScript("window.scrollBy(0,200);");
			
		}

	}



