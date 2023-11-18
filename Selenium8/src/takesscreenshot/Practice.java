package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com");
		File photo=driver.findElement(By.name("username")).getScreenshotAs(OutputType.FILE);
		File destination=new File("./Seleniumphotos/insta3.png");
		//photo.renameTo(destination);
		//FileHandler.copy(photo, destination);
		FileUtils.copyFile(photo, destination);
		
		
		
		

	}

}
