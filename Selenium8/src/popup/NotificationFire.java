package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationFire 
{
	public static void main(String[] args) 
	{
//		System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");
//		FirefoxOptions option=new  FirefoxOptions();
//		 option.addArguments("--disable-notifications");
//		 WebDriver driver=new FirefoxDriver(option);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions option=new  ChromeOptions();
		 option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ajio.com/");
		
	}

}
