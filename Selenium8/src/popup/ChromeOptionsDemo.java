package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions option=new  ChromeOptions();
	//to handle notification popup
	option.addArguments("--disable-notifications");
	//to open browser in incognito
	option.addArguments("--incognito");
	//to open browser in maximized mode
	option.addArguments("start-maximized");
	//to open browser in headless mode
	option.addArguments("--headless");
	WebDriver driver=new ChromeDriver(option);
	System.out.println("browser is launched");
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.ajio.com/");
	System.out.println("browser is navigated to ajio");
	driver.quit();
	}

}
