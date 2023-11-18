package dataDrivernTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingDataFromPropertyFile {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    FileInputStream fis=new FileInputStream("./TestData/data.properties");
	    Properties property=new Properties();
	    property.load(fis);
	    driver.get(property.getProperty("url"));
	    driver.findElement(By.id("Email")).sendKeys(property.getProperty("un"));
	    driver.findElement(By.id("Password")).sendKeys(property.getProperty("pwd"));
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    
	    /*FileInputStream fis=new FileInputStream("./TestData/data.properties");
	    Properties property=new Properties();
	    property.load(fis);
	    String value=property.getProperty("url");
	    System.out.println(value);*/
	    
	    

	}

}
