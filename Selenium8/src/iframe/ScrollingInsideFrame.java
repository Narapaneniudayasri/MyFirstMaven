package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingInsideFrame 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
	System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	driver.switchTo().frame("frm3");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("scrollTo(0,2000)");
	}

}
