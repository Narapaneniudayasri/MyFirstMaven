 package jse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElement

{
	public static void main(String[] args) throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("file:///E:/Uday/Page.html");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebElement element = driver.findElement(By.id("username"));
	js.executeScript("arguments[0].value='udayasri'", element);//disabled element
	System.out.println(js.executeScript("return document.title"));//title of the web page
	System.out.println(js.executeScript("return window.location.href"));//return the url of web page
	}
}
