package jse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnteringTheDataClearDataClickingElements {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//String data="seleniumclass830";(concatenation)
		WebElement SearchStore = driver.findElement(By.id("small-searchterms"));
		WebElement SearchButton=driver.findElement(By.xpath("//input[@value='Search store']"));
		//js.executeScript("arguments[0].value='"+data+"'", SearchStore);(Concatenation)
		js.executeScript("arguments[0].value='Selenium123'", SearchStore);//enter the data into text field
		//js.executeScript("arguments[0].value='Selenium123'", SearchStore);
		Thread.sleep(2000);
		js.executeScript("arguments[0].value=' '",SearchStore);//clear the data from text field
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()",SearchButton);

	   }

}
