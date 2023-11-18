package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithCheckbox 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demoapps.qspiders.com/alert/alertCheck");
	driver.findElement(By.xpath("//button[text()='Open alert']")).click();
	Alert alert = driver.switchTo().alert();
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	alert.accept();
	}

}
