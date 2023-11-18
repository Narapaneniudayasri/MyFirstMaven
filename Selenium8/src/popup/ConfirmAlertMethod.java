package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfirmAlertMethod 
{
	public static void main(String[] args) 
	{
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	//WebDriver driver=new ChromeDriver();
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demoapps.qspiders.com/alert/confirm");
	driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	Alert confirmationAlert=driver.switchTo().alert();
	//confirmationAlert.accept();
	System.out.println(confirmationAlert.getText());
	
	}

}
