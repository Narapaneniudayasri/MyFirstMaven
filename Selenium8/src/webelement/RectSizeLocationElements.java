package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RectSizeLocationElements {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element=driver.findElement(By.id("newsletter-subscribe-button"));
		System.out.println("The X value is:"+element.getLocation().x);
		System.out.println("The Y value is:"+element.getLocation().y);
		System.err.println("**************************");
		System.out.println("The Height is:"+element.getSize().height);
		System.out.println("The Width is:"+element.getSize().width);
		System.err.println("********************************");
		System.out.println("The X value is:"+element.getRect().x);
		System.out.println("The Y value is:"+element.getRect().y);
		System.out.println("***********************************");
		System.out.println("The Height is:"+element.getRect().height);
		System.out.println("The Height is:"+element.getRect().height);
		
		
		
		

	}

}
