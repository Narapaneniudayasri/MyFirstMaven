package popup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newWinBtn")).click();
		Set<String> allId = driver.getWindowHandles();
		String parentId = driver.getWindowHandle();
		String expectedTitile="AlertsDemo";
		for(String id:allId) {
			driver.switchTo().window(id);
			if(driver.getTitle().contains(expectedTitile)) {
					break;
			}
		}
		driver.manage().window().maximize();	
		

	}

}
